package a26_0826.exception;

public class BankApp {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(0);

    try {
      System.out.println("===== 첫 번째 출금 시도 (5,000원) =====");
      account.withDraw(5000); // 성공

      System.out.println("===== 두 번째 출금 시도 (8,000원) =====");
      account.withDraw(8000); // 실패, 예외 발생

      System.out.println("이 코드는 실행되지 않습니다."); // 예외 발생 시 건너뜀

    } catch (InsufficientBalanceException e) {
      // 사용자 정의 예외로 처리
      System.out.println("[ 예외 캐치 성공 ] " + e.getMessage());
    }
    System.out.println("\n===== 프로그램 정상 종료 =====");
  }
}
