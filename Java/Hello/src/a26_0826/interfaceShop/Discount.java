package a26_0826.interfaceShop;

public interface Discount { // 원가에 할인 적용
  double apply(int price); // 상품 가격을 받아서 할인된 가격을 반환

  String getName(); // 어떤 할인인지 이유를 반환 (ex. 회원, 쿠폰, 할인 없음 등)
}
