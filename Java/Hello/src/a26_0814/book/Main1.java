package a26_0814.book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
    // 저자 정보 저장
        Author1 jkRowling = new Author1("J.K. Rowling", "UK");
        Author1 georgeOrwell = new Author1("George Orwell", "UK");
        Author1 harukiMurakami = new Author1("Haruki Murakami", "Japan");
        Author1 stephenKing = new Author1("Stephen King", "USA");
        Author1 leoTolstoy = new Author1("Leo Tolstoy", "Russia");

    // 책 정보 저장
        List<Book1> bookArr = Arrays.asList(
            new Book1(jkRowling, 1997, 15000, "Harry Potter"),
            new Book1(georgeOrwell, 1949, 12000, "1984"),
            new Book1(harukiMurakami, 2002, 18000, "Kafka on the Shore"),
            new Book1(stephenKing, 1977, 20000, "The Shining"),
            new Book1(jkRowling, 1998, 15000, "Harry Potter 2"),
            new Book1(georgeOrwell, 1945, 11000, "Animal Farm"),
            new Book1(harukiMurakami, 2013, 19000, "Colorless Tsukuru"),
            new Book1(stephenKing, 1986, 22000, "It"),
            new Book1(leoTolstoy, 1869, 25000, "War and Peace")
        );
        
    // #1 2000년 이후 출판된 모든 도서를 가격 오름차순으로 정렬
        Practice1(bookArr);
    
    // #2 출판 도서의 모든 국가를 중복없이 나열
        Practice2(bookArr);
    }

// #1 2000년 이후 출판된 모든 도서를 가격 오름차순으로 정렬
    private static void Practice1(List<Book1> bookArr) {
        List<Book1> result = bookArr.stream()
            .filter(book -> 2000 < book.getYear())
            .sorted(Comparator.comparing(Book1::getPrice))
            .toList();

        System.out.println(result);
        System.out.println();
    }

// #2 출판 도서의 모든 국가를 중복없이 나열
    private static void Practice2(List<Book1> bookArr) {
        
    }
}
