package a26_0814.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

// Java Stream은 Java 8에서 추가된 기능
// 컬렉션(List, set, Map 등)이나 배열의 데이터를 반복하면서 가공
// 데이터 필터링, 정렬, 반환, 집계 기능
// ex) for문을 더 쉽고

public class StreamEx01 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(90, 80, 70, 100, 95);

        for(Integer i : scores) {
            System.out.println(i);
        }
        System.out.println();

        scores.stream().forEach(i -> System.out.println(i));
    }
}
