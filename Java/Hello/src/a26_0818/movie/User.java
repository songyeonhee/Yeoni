package a26_0818.movie;

import java.util.ArrayList;

public class User {
  private String name;
  private ArrayList<Integer> reservationNumbers; // 예매 번호
  private ArrayList<String> reservedMovies; // 예매한 영화 제목
  private ArrayList<Integer> reservedSeats; // 예매한 좌석 번호
  private static int reservationCounter = 1; // 모든 사용자가 공유하는 예매 번호
  private int totalPaid = 0; // 누적 결제 금액

  public User(String name, ArrayList<Integer> reservationNumbers, ArrayList<String> reservedMovies,
      ArrayList<Integer> reservedSeats) {
    this.name = name;
    this.reservationNumbers = new ArrayList<>(); // reservationNumbers
    this.reservedMovies = new ArrayList<>(); // reservedMovies
    this.reservedSeats = new ArrayList<>(); // reservedSeats
    // 왜 기본 설정 값을 쓰지 않고 new ArrayList<>();로 설정?
    // 선언만 해주고, 초기화 시킴?
  }

  public String getName() {
    return name;
  }

  public ArrayList<Integer> getReservationNumbers() {
    return reservationNumbers;
  }

  public ArrayList<String> getReservedMovies() {
    return reservedMovies;
  }

  public ArrayList<Integer> getReservedSeats() {
    return reservedSeats;
  }

  public static int getReservationCounter() {
    return reservationCounter;
  }

  public int getTotalPaid() {
    return totalPaid;
  }

  public void addReservation(String title, int seatNumber) {
    // TODO:
      // 1. reservedMovies에 movieTitle 추가
      // 2. reservedSeats에 seatNumber 추가
      // 3. reservationCounter를 사용하여 예매번호 부여 (나중에 추가)

    reservedMovies.add(title); // 예매한 영화 제목
    reservedSeats.add(seatNumber); // 예매한 좌석 번호
    reservationNumbers.add(reservationCounter); // 예매 번호 부여 후 증가
  }

}
