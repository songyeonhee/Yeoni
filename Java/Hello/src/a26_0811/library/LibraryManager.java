package a26_0811.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<Library> libraries; // Library를 객체로 리스트 변수 생성
    private ArrayList<Library> bookLocation; // Library를 객체로 대여한 객체를 저장하는 리스트 변수 생성

    public LibraryManager() {
        libraries = new ArrayList<>();
        bookLocation = new ArrayList<>();
        libraries.add(new Library("this is java", "shin", "SectionA","979-11-691-229-8"));
        libraries.add(new Library("First React", "Lee Inje", "Section B", "979-11-6921-169-7"));
        libraries.add(new Library("Web Standards", "Ko Kyunghee", "Section C", "979-11-6303-622-7"));
    }

    public void allLibrary() {
        System.out.println("대출 가능한 도서 보기");
        for(int i=0; i<libraries.size(); i++) {
            Library library = libraries.get(i);

            if(library.isAvailable()){ // true 저장된 것만
                System.out.println(library);
            }
        }
    }

    public boolean bookLocation(String bookName) {
        for(Library library: libraries) { // libraries 리스트를 돌며 한 개 객체를 library로 옮김
            if(library.getTitle().equalsIgnoreCase(bookName) && library.isAvailable()) {
                // 대소문자 구분 없이 library에서 title 목록과 키보드로 입력한 bookName 이름 비교
                // 대출 가능 여부 (true)
                library.book(); // 대출 처리, isAvailable = false;
                bookLocation.add(library); // 대출된 도서 목록 bookLocation(arrayList) 추가
                return true;
            }
        }
        return false;
    }

    public void bookLocation() {
        System.out.println("대출한 도서 보기");
        for(Library location : bookLocation) {
            System.out.println(location);
        }
    }

    public void addLibrary(String newTitle, String newAuthor, String newLocation, String newISBN) {
        Library library = new Library(newTitle, newAuthor, newLocation, newISBN);
        libraries.add(library);

    }

    public void delLibrary(String deleteName) {
        boolean result = false;
        for(Library library: libraries) {
            if(library.getTitle().equalsIgnoreCase(deleteName)){
                if(library.isAvailable()) {
                    libraries.remove(library);
                    result = true;
                    break;
                }else {
                    result = false;
                    break;
                }
            }
        }
        if(result) {
            System.out.println("삭제 완료");
        }
        else {
            System.out.println("삭제되지 않음");
        }
    }

    public void updateLibrary(String updateName) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        for(Library a : libraries) {
            if (a.getTitle().equalsIgnoreCase(updateName)) {
                System.out.println("수정\n" + "1. 도서 이름\t 2. 도서 저자\t 3. 도서 위치\t 4. 도서 ISBN\n");
                int menu = Integer.parseInt(sc.nextLine());

                switch (menu) {
                    case 1:
                        System.out.println("수정할 이름 > ");
                        a.setTitle(sc.nextLine()); // 키보드로 입력받는 내용으로 바로 수정
                        break;

                    case 2:
                        System.out.println("수정할 저자 > ");
                        a.setAuthor(sc.nextLine()); // 키보드로 입력받는 내용으로 바로 수정
                        break;

                    case 3:
                        System.out.println("수정할 위치 > ");
                        a.setLocation(sc.nextLine()); // 키보드로 입력받는 내용으로 바로 수정
                        break;

                    case 4:
                        System.out.println("수정할 ISBN > ");
                        a.setIsbn(sc.nextLine()); // 키보드로 입력받는 내용으로 바로 수정
                        break;
                
                    default:
                        System.out.println("1~4번 중 입력하세요");
                        return;
                }
                found = true;
                break; // 찾았으면 반복 종료
                
            }
        }
         if(!found){
        System.out.println("찾는 도서가 없어서 업데이트 할 수 없습니다.");
    }

}

    public void searchLibrary(String searchTitle) {
        for(Library library : libraries) {
            if(library.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println(library);
            }
        }
    }
}