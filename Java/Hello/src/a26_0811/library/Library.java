package a26_0811.library;

public class Library {
    private String title;
    private String author;
    private String location;
    private String isbn;
    private boolean available; // 대여 가능 여부

    public Library() {
    }

    public Library(String title, String author, String location, String isbn) {
        this.title = title;
        this.author = author;
        this.location = location;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "제목 > " + title + " | 저자 > " + author + " | 위치 : " + location + " | ISBN > " + isbn + (available ? "대출 가능":"대출 불가능")
                ;
    }

    // 도서 대출 후 대출 불가능 메서드 작성
    public void book(){
        this.available = false;
    }
    
}
