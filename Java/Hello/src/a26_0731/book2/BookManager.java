package a26_0731.book2;

import java.util.Scanner;

public class BookManager {
    static Book[] bookList = new Book[100];
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            PrintMenu();
            int choice = sc.nextInt();
             sc.nextLine();

            switch (choice) {
                case 1:
                    createBook(sc);
                    break;
                
                case 2:
                    readBook();
                    break;

                case 3:
                    updateBook(sc);
                    break;

                case 4:
                    
                    break;
                    
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
            
                default:
                    break;
            }
        }
    }

private static void updateBook(Scanner scanner) {
        System.out.println("\n--- [도서 정보 수정] ---");
        readBook();
        if (bookCount == 0) return;
        System.out.print("수정할 도서의 관리번호 입력: ");
        int targetNo = scanner.nextInt();

        // 관리번호로 배열에서 해당 도서 찾기 (번호는 1부터 시작하므로 index는 targetNo - 1)
        int index = findBookIndexByNo(targetNo);
        if(index == -1){
           System.out.println("결과 : 일치하는 관리번호의 도서가 없습니다.");
           return;
        }
        scanner.nextLine();
        System.out.print("새로운 제목: ");
        String newTitle = scanner.nextLine();
        
        System.out.print("새로운 저자: ");
        String newAuthor = scanner.nextLine();
        
        System.out.print("새로운 가격: ");
        int newPrice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("현재 선택된 도서: " + bookList[index].getTitle() + " (" + bookList[index].getAuthor() + ")");
        bookList[index].setTitle(newTitle);
        bookList[index].setAuthor(newAuthor);
        bookList[index].setPrice(newPrice);

        System.out.println("결과: 도서 정보가 성공적으로 수정되었습니다.\n");
    }

    private static int findBookIndexByNo(int no) {
        for(int i=0; i<bookCount; i++) {
            if(bookList[i].getNo() == no){
                return i; // 찾으면 인덱스 번호 반환
            }
        }return -1; // 못찾으면 -1번
}

    private static void readBook() {
        System.out.println("\n--- [전체 도서 목록] ---");
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.\n");
            return;
        }
        for(int i=0; i < bookCount; i++) {
            Book b = bookList[i];
            System.out.printf("관리번호: %d | 제목: %s | 저자: %s | 가격: %,d원\n", b.getNo(), b.getTitle(), b.getAuthor(), b.getPrice());
        }
    }

    // 도서 등록
    private static void createBook(Scanner sc) {
        System.out.println("\n--- [도서 등록] ---");
        if (bookCount >= 100) {
            System.out.println("더 이상 등록할 수 없습니다.");
            return;
        }
        int no = bookCount + 1;
        System.out.print("책 제목: ");
        String title = sc.nextLine();
        
        System.out.print("저자: ");
        String author = sc.nextLine();
        
        System.out.print("가격: ");
        int price = sc.nextInt();
        //sc.nextInt(); 엔터 제거
        // 숫자만 가져가고 enter(\n)은 버퍼에 남는다

        // Book 객체 생성 후 저장
        bookList[bookCount] = new Book(no, title, author, price);
        bookCount++;
        System.out.println("등록 성공 : " + title + " / 관리 번호 : " + no);
        }

    private static void PrintMenu() {
        System.out.println("==================================================");
        System.out.println(" 1. 도서등록(C) | 2. 도서조회(R) | 3. 도서수정(U) | 4. 도서삭제(D) | 5. 종료 ");
        System.out.println("==================================================");
        System.out.print("선택> ");
    }

}