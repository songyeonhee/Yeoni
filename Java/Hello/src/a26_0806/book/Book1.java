package a26_0806.book;

public class Book1 {
    private String title;
    private String author;
    private int price;
    
    public Book1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "제목 : " + title + " | 저자 : " + author + " | 가격 : " + price + "원";
    }

    
}
