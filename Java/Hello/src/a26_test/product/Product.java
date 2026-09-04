package a26_test.product;

public class Product {
  private String name;
  private int price;
  private int quantity;

  public Product() {
  }

  public Product(String name, int price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "상품명: " + name + ", 가격: " + price + "원, 수량: " + quantity + "개";
  }

  public int getTotalPrice() {
    return price * quantity;
  }

}
