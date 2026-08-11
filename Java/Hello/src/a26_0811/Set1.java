package a26_0811;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set1 {
public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();

    // 요소 추가
    set.add("사과");
    set.add("바나나");
    set.add("오렌지");
    set.add("사과"); // 중복 추가 시도, 중복 허용되지 않음

    for(String item : set) {
        System.out.println(item);
    }

    // 요소 확인
    boolean hasApple = set.contains("사과"); // true
    System.out.println(hasApple);
    // set > 중복 허용 안함, 순서 보장 안됨

    // 요소 삭제
    set.remove("바나나");
    for(String item : set) {
        System.out.println(item);
    }

    System.out.println("순서가 있는 입력/출력");
    LinkedHashSet<String> set1 = new LinkedHashSet<>();
    set1.add("사과");
    set1.add("바나나");
    set1.add("오렌지");
    // 삽입 순서대로 출력됨
    for(String item : set1) {
        System.out.println(item);
    }
}}
