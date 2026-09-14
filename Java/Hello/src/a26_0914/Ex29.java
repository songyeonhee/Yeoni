package a26_0914;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> students = new ArrayList<>();

    boolean run = true;
    while (run) {
      System.out.println("1. 추가  2. 목록  3. 삭제  4. 종료");
      System.out.print("선택 > ");
      int com = Integer.parseInt(sc.nextLine());
      switch (com) {
        case 1: // 추가
          System.out.print("이름 입력 : ");
          String name = sc.nextLine();
          students.add(name);
          break;

        case 2: // 목록
          System.out.println(students);
          break;

        case 3: // 삭제
          System.out.print("삭제할 인덱스 입력 : ");
          int index = Integer.parseInt(sc.nextLine());
          students.remove(index);
          break;

        case 4: // 종료
          System.out.println("프로그램 종료");
          run = false;
          break;

        default:
          System.out.println("잘 못된 입력입니다.");
          break;
      }
    }
  }
}