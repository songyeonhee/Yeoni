package a26_0914;

public class Ex19 {
  public static void main(String[] args) {
    Book b = new Book("해리포터", 18000);
    System.out.println(b.getTitle());
    System.out.println(b.getPrice() + "원");
  }
}

class Book {
  private String title;
  private int price;

  public Book(String title, int price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}