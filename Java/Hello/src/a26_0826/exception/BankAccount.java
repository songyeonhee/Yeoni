package a26_0826.exception;

public class BankAccount {
  private int balance = 10000; // 초기 잔고 10000원

  public BankAccount(int balance) {
    this.balance = balance;
  }

  public void withDraw(int amount) throws InsufficientBalanceException {
    if (balance < amount) { // 잔고가 부족한 경우 사용자 정의 예외
      throw new InsufficientBalanceException("잔고 부족 | 현재 잔고 : " + balance + " | 출금액 : " + amount);
    }
    balance -= amount;
    System.out.println(amount + "원 정상 출금 | 남은 잔고 : " + balance);
  }
}
