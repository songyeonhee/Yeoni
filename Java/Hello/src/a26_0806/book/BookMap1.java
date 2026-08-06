package a26_0806.book;

import java.util.HashMap;
import java.util.Map;

public class BookMap1 {
    public static void main(String[] args) {
        Map<String, Book1> bookMap = new HashMap<>();

        bookMap.put("B001", new Book1("자바의 정석", "남궁성", 30000));
        bookMap.put("B002", new Book1("혼자 공부하는 자바", "신용권", 28000));
        bookMap.put("B003", new Book1("이것이 자바다", "신용권", 35000));

        System.out.println("======================== 전체 도서 목록 ========================");
        for(String key : bookMap.keySet()) {
            System.out.println(key + " > " + bookMap.get(key));
        }

        System.out.println();

        System.out.println("=========================== B002 조회 ==========================");
        Book1 b002 = bookMap.get("B002");
        System.out.println(b002);

        System.out.println();

        System.out.println("======================== B002 가격 수정 ========================");
        bookMap.get("B002").setPrice(25000);
        System.out.println(bookMap.get("B002"));

        System.out.println();

        System.out.println("=========================== 도서 삭제 ==========================");
        bookMap.remove("B003");
        System.out.println(bookMap);

        System.out.println();

        System.out.println("======================== entrySet 출력 =========================");
        for(Map.Entry<String, Book1> entry : bookMap.entrySet()) {
            String num = entry.getKey();
            Book1 b1 = entry.getValue();

            System.out.println(num + " > " + b1);
        }
    }
}
