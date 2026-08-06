package a26_0806.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// 컬렉션(collection) 프레임워크 : 다수의 데이터를 쉽고 효과적으로 처리하는 클래스의 집합
// List, Set, Map

public class List1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // <Integer> int의 객체형 (참조형):
        // 제네릭은 객체를 다루기 때문에 기본형인 int는 허용되지 않음

        // add() 메서드를 이용한 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        // for문과 get() 메서드를 이용한 요소의 출력
        for(int i=0; i<arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        arrList.remove(1);

        for(int n :arrList) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Collections.sort(); 메소드를 이용한 요소의 정렬
        // 가장 상위에 있는 클래스로 Collections에서 정렬을 지원
        Collections.sort(arrList);

        // Iterator() 메서드와 get() 메서드를 이용한 요소의 출력
        // 중요도 없음
        Iterator<Integer> iter = arrList.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // Set() 메서드를 이용한 요소의 변경
        arrList.set(0, 20);
        for(int e : arrList) {
            System.out.print(e + " ");
        }
        System.out.println();

        // 크기 확인
        System.out.println("리스트의 크기 : " + arrList.size());
    }
}

