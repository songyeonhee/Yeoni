package a26_0805.book3;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            printMenu();
            int menu;

            try {
                menu = Integer.parseInt(sc.nextLine()); // 문자 1, 2, 3으로 입력받은 항목을 숫자로 변환
            } catch (Exception e) { // 예외 발생 ex) 문자를 입력했을 때
                System.out.println("숫자만 입력 가능합니다.");
                continue; // while문으로 돌아가서 다시 선택할 수 있게 해준다.
            }

            // 더미 데이터
            list.add(new Book("자바의 정석", "남궁성"));
            list.add(new Book("혼자 공부하는 자바", "신용권"));
            list.add(new Book("이것이 자바다", "신용권"));

            switch(menu) {
                case 1 : // 등록
                    System.out.print("제목을 입력하세요 : ");
                    String title = sc.nextLine();

                    System.out.print("저자를 입력하세요 : ");
                    String author = sc.nextLine();

                    list.add(new Book(title, author));
                break;

                case 2 : 
                    System.out.print("조회할 도서를 입력하세요 : ");
                    title = sc.nextLine();
                    Book b = findBook(list, title);

                    if(b != null) {
                        System.out.println(b);
                    }
                    else {
                        System.out.println("일치하는 도서가 없습니다.");
                    }
                break;
                
                case 3 : // 수정
                System.out.print("수정할 도서를 입력하세요 : ");
                title = sc.nextLine();
                System.out.print("수정할 저자를 입력하세요 : ");
                author = sc.nextLine();

                if(updateBook(list, title, author)) {
                    System.out.println("수정이 완료되었습니다.");
                }
                else {
                    System.out.println("일치하는 도서가 없습니다.");
                }
                break; 

                case 4 :
                System.out.print("삭제할 도서를 입력하세요 : ");
                title = sc.nextLine();

                if(deleteBook(list, title)) {
                    System.out.println("삭제가 완료되었습니다.");
                }
                else {
                    System.out.println("일치하는 도서가 없습니다.");
                }
                break;

                case 5 : // 조회 (출력)
                    if(list.isEmpty()) {
                        System.out.println("등록된 도서가 없습니다.");
                    }
                    else {
                        for(Book book : list) {
                            System.out.println(book);
                            // toString 만들어져있으므로 출력
                        }
                    }
                break;

                case 6 : // 종료
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                break;    

                default : 
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("===================");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 전체 출력");
        System.out.println("6. 종료");
        System.out.println("===================");
        System.out.print("선택 > ");

    }

    private static Book findBook(ArrayList<Book> list, String title) {
        for(Book b : list) {
            if(b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }

    private static boolean updateBook(ArrayList<Book> list, String title, String newAuthor) {
       for(Book b : list){
         if(b.getTitle().equals(title)){ // 제목이 같으면
            b.setAuthor(newAuthor); // 새 책 이름으로 책 제목만 수정
            return true;
         }
       }
       return false;
    }

    private static boolean deleteBook(ArrayList<Book> list, String title) {
        // 삭제 시 인덱스 번호 필요
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getTitle().equals(title)){
                list.remove(i);
                return true;
            }
        }
        return false;
    }
}
