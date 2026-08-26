package a26_0826.interfaceShop;

public class MemberDiscount implements Discount {

  @Override
  public double apply(int price) {
    return (int) (price * 0.9);
  }

  @Override
  public String getName() {
    return "회원 할인";
  }

}
