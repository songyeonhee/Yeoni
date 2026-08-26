package a26_0826.interfaceShop;

public class NoDiscount implements Discount {

  @Override
  public double apply(int price) {
    return price;
  }

  @Override
  public String getName() {
    return "할인 없음";
  }

}
