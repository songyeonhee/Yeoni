package a26_0818.movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// 의존성 (Dependency) : Ticket 클래스가 정상적으로 동작하려면 ReservationManager(예약 관리자)기능이 있어야함
// 이러한 내용을 의존한다고 표현

// 주입 (Injection) : Ticket이 직접 ReservationManager를 코드 내부에서 생성하는 것이 아닌
// 객체를 만드는 주체(외부)가 생성하여 생성자의 매개변수로 넣는(주입하는) 방식

public class Ticket {
  private ReservationManager reservationManager; // 예약관리자

  // 기존 예약 관리자를 받아서 사용하도록 변경 - DI (의존성 주입)
  public Ticket(ReservationManager reservationManager) {
    this.reservationManager = reservationManager;
  }

  public void printTicket(int reservationNum) {
    try {
      File dir = new File("d:\\movieTicket");
      if(!dir.exists()) { // 폴더가 없으면
        dir.mkdir(); // 디렉토리(폴더) 생성
      }
      File file = new File(dir,"ticket_"+reservationNum+".txt");
      boolean isNewfile = file.createNewFile(); // 파일이 없으면 생성

      try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
        if(file.canWrite()) {
          if(!isNewfile) {
            bufferedWriter.newLine(); // 기존 파일이면 개행 (줄바꿈 추가)
          }
          // 예매 정보를 가져와서 저장
          String ticketInfo = reservationManager.getReservationDetails(reservationNum);
          if(ticketInfo == null) {
            System.out.println("예매 정보를 찾을 수 없습니다.");
            return;
          }
          bufferedWriter.write(ticketInfo);
          bufferedWriter.flush(); // 저장
          System.out.println("티켓 출력 성공");

        }else {
          System.out.println("티켓 출력 실패 : 권한 문제");
        }
      }
    } catch (Exception e) {
      System.out.println("티켓 출력 실패 : " + e.getMessage());
    }
  }

  public void updateMovieList() {
    File file = new File("d:\\movieTicket\\movieList.txt");

    if(!file.exists()) {
      System.out.println("movieList.txt 파일이 존재하지 않습니다.");
      return;
    }
    try(BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
      String line;
      System.out.println("======================================");

      while ((line = BufferedReader.readLine()) != null) {
        line = line.trim();
        if (line.isEmpty())
        continue; // 빈 줄일때는 돌아감 (위로 올라감)

        String[] movies = line.split("/");
        if(movies.length != 4) {
          System.out.println("잘 못된 형식의 영화 정보입니다. (" + line + ")");
        }
        try {
          String title = movies[0]; // 영화 제목
          String genre = movies[1]; // 상영 시간
          int rows = Integer.parseInt(movies[2]); // 가격
          int totalSeats = Integer.parseInt(movies[3]); // 총 좌석

          //중복영화확인
          if (reservationManager.getMovie(title) != null) {
            System.out.println("중복된 영화 [" + title + "] 은(는) 추가되지 않습니다.");
            continue;
          }
          Movie movie = new Movie(title, genre, rows, totalSeats);
          reservationManager.addMovie(movie);
          System.out.println("영화 추가됨: "+ movie.getTitle());

        } catch (Exception e) {
          System.out.println("좌석 수 또는 행 수가 잘못된 숫자입니다." + line);
        }
      }
    }
    catch (IOException e) {
      System.out.println("불러오기 오류" + e.getMessage());
    }
  }

}
