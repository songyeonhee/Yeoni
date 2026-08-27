package a26_0827.exam;

public class Product {
  private String name; // 상품명
  private int price; // 상품 가격
  private int stock; // 재고 수량

  public Product(String name, int price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "상품명: [" + name + "], 가격: [" + price + "]원, 재고: [" + stock + "]개";
  }

  public int getTotalValue() {

    return price * stock;
  }

  public boolean isAvailable() {
    return stock > 0;
  }

}
