package a26_0805.array;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // 선언
        ArrayList<String> list = new ArrayList<>();

        list.add("잭클린");
        list.add("이사벨");
        list.add("신기루");

        for(String name :list) {
            System.out.println(name);
        }
         System.out.println();

        System.out.println(list.size()); // ArrayList 개수 (배열과 다름)
        System.out.println();

        System.out.println(list.get(0));
        System.out.println();

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println("==== 수정 ====");
        list.set(1, "조나단");
        for(String name :list) {
        System.out.println(name);
        }
        System.out.println();

        System.out.println("==== 삭제 ====");
        list.remove(1);
        for(String name :list) {
        System.out.println(name);
        }
        System.out.println();

        System.out.println("==== 삽입 ====");
        list.add(1,"딸기");
        for(String name :list) {
        System.out.println(name);
        }
        System.out.println();
    }
}
