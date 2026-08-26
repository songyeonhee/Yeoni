package a26_0826.interfaceShop;

public interface Payable { // 할인된 금액 결제
  boolean pay(int amount);

  String getMethodName();
}
