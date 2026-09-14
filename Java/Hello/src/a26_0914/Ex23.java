package a26_0914;

public class Ex23 {
  public static void main(String[] args) {
    Payable p = new CardPay();
    p.pay(10000);
  }

  public interface Payable {
    void pay(int amount);
  }

  static class CardPay implements Payable {
    @Override
    public void pay(int amount) {
      System.out.println("카드 결제 : " + amount);
    }
  }
}