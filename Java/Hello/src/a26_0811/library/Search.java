package a26_0811.library;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();
        // 생성과 동시에 더미 데이터 3개도 생성 메서드에 있기 때문에 생성됨

        boolean flag = true;
        while (flag) {
            System.out.println("\n도서검색 시스템에 오신 것을 환영합니다.");
            System.out.println("1.대출 가능한 도서 보기");
            System.out.println("2.도서 대출하기");
            System.out.println("3.대출한 도서 보기");
            System.out.println("4.도서 추가하기");
            System.out.println("5.도서 삭제하기");
            System.out.println("6.도서 정보 수정하기");
            System.out.println("7.도서 내용 보기");
            System.out.println("8.종료");
            System.out.print("원하는 작업을 선택하세요 >>");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("대출 가능한 도서");
                    manager.allLibrary();
                    // 대출 상태가 아닌 책만 출력
                    break;
                
                case 2:
                    System.out.println("도서 대출하기");
                    System.out.print("대출하려는 도서명 입력 > ");
                    String bookName = sc.nextLine();
                    if(manager.bookLocation(bookName)){
                        System.out.println("도서 대출이 완료되었습니다");
                    }
                    else {
                        System.out.println("존재하지 않거나 대출이 불가능한 도서입니다.");
                    }
                    break;    
                
                case 3:
                    System.out.println("대출한 도서");
                    manager.bookLocation(); // 메서드 이름은 같으나 매개 변수가 없으므로 메서드 오버로딩
                    break;

                case 4:
                    System.out.println("도서 추가하기");
                    // 도서명, 저자, 위치 ISbn - 함수 도서 리스트에 add
                    System.out.print("추가할 도서명 > ");
                    String newTitle = sc.nextLine();
                    System.out.print("추가할 저자명 > ");
                    String newAuthor = sc.nextLine();
                    System.out.print("도서의 위치 > ");
                    String newLocation = sc.nextLine();
                    System.out.print("도서 ISBN > ");
                    String newISBN = sc.nextLine();

                    manager.addLibrary(newTitle, newAuthor, newLocation, newISBN);
                    System.out.println("도서 추가 완료");
                    break;

                case 5:
                    System.out.println("도서 삭제하기");
                    System.out.print("삭제할 도서명 > ");
                    String deleteName = sc.nextLine();
                    if(deleteName.equals("")) {
                        System.out.print("삭제하려는 도서 다시 입력 > ");
                        deleteName = sc.nextLine();
                    }
                    manager.delLibrary(deleteName);
                    System.out.println("도서 삭제 완료");
                break;

                case 6:
                    System.out.println("도서 수정하기");
                    System.out.print("수정할 도서명 > ");
                    String updateName = sc.nextLine();

                    if(updateName.equals("")) {
                        System.out.print("수정하려는 도서 다시 입력 > ");
                        updateName = sc.nextLine();
                    }
                    manager.updateLibrary(updateName);
                    System.out.println("도서 수정 완료");
                break;

                case 7:
                    System.out.println("조회 시작 \n 도서 이름 입력");
                    String searchTitle = sc.nextLine();

                    if(searchTitle.equals("")) {
                        System.out.print("조회하려는 도서 다시 입력 > ");
                        searchTitle = sc.nextLine();
                    }
                    manager.searchLibrary(searchTitle);
                    System.out.println("도서 조회 완료");
                    break;

                case 8:
                    System.out.println("프로그램 종료");
                    flag = false;
                    break;
                default:
                    break;
                    
            }
        }
    }
}
