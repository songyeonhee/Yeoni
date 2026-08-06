package a26_0806.collection;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        // LinkedList 생성
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("첫 번째");
        linkedList.add("두 번째");
        linkedList.add("세 번째");
        System.out.println("초기 리스트 : " + linkedList);

        // 앞에 추가
        linkedList.addFirst("맨 앞");
        System.out.println("addFirst 리스트 : " + linkedList);

        // 뒤에 추가
        linkedList.addLast("맨 뒤");
        System.out.println("addLast 리스트 : " + linkedList);

        // 첫 번째 + 마지막 프린트
        System.out.println("첫 번째 요소 : " + linkedList.getFirst());
        System.out.println("마지막 요소 : " + linkedList.getLast());

        // index 번호로 추가
        linkedList.add(1, "중간");
        System.out.println("중간 리스트 : " + linkedList);

        // index 번호로 삭제
        linkedList.remove(3);
        System.out.println("삭제 리스트 : " + linkedList);

        System.out.println("\n=== ArrayList vs LinkedList ===");
        System.out.println("ArrayList: 인덱스 접근이 빠름, 중간 삽입/삭제가 느림");
        // 중간 데이터를 삽입하면 뒤의 데이터 인덱스 번호가 한 칸씩 밀림
        // 중간 데이터를 삭제하면 뒤의 데이터 인덱스 번호가 한 칸씩 당겨짐
        System.out.println("LinkedList: 중간 삽입/삭제가 빠름, 인덱스 접근이 느림");
        // 선으로 연결되어있어 중간 데이터가 삭제되더라도 연결이 빠름
    }
}
