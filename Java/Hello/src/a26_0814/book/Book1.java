package a26_0814.book;

public class Book1 {
    private Author1 author;
    private int year;
    private int price;
    private String title;
    
    public Book1(Author1 author, int year, int price, String title) {
        this.author = author;
        this.year = year;
        this.price = price;
        this.title = title;
    }

    public Author1 getAuthor() {
        return author;
    }

    public void setAuthor(Author1 author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book1 [author=" + author + ", year=" + year + ", price=" + price + ", title=" + title + "]";
    }
}
