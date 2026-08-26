package a26_0826.interfaceShop;

public class CouponDiscount implements Discount {
  private int couponAmount;

  public CouponDiscount(int couponAmount) {
    this.couponAmount = couponAmount;
  }

  @Override
  public double apply(int price) {
    int result = price - couponAmount;
    return result < 0 ? 0 : result; // 0보다 작으면 0을 출력, 그 외 result 반환
  }

  @Override
  public String getName() {
    return "쿠폰 할인 : " + couponAmount + "원";
  }

}
