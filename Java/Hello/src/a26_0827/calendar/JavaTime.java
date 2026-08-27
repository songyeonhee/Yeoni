package a26_0827.calendar;

import java.time.LocalDate;
import java.time.LocalTime;

public class JavaTime {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);

    // 날짜
    System.out.println(today.getYear());
    System.out.println(today.getMonth());
    System.out.println(today.getMonthValue());
    System.out.println(today.getDayOfMonth());

    // 시간
    LocalTime now = LocalTime.now();
    System.out.println(now.getHour());
    System.out.println(now.getMinute());
    System.out.println(now.getSecond());

    // 특정 날짜 만들기
    LocalDate date = LocalDate.of(2026, 9, 27);
    System.out.println(date);
  }
}
