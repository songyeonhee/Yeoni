package a26_0814.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class stream04 {
public static void main(String[] args) {
// 중첩 리스트를 평탄화
    List<List<Integer>> nestedList = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9)
    );

    List<Integer> flatList = nestedList.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());
// 결과: [1, 2, 3, 4, 5, 6, 7, 8, 9]

// 문자열을 문자로 분리
    List<String> words = Arrays.asList("Hello", "World");
    List<String> letters = words.stream()
        .flatMap(word -> Arrays.stream(word.split("")))
        .collect(Collectors.toList());
// 결과: ["H", "e", "l", "l", "o", "W", "o", "r", "l", "d"]

// 중복 제거
    List<Integer> numbers = Arrays.asList(4, 2, 2, 3, 3, 3, 1);
    List<Integer> unique = numbers.stream()
        .distinct()
        .sorted()
        .toList();

    System.out.println("숫자 정렬 중복 제거 : " + unique);

// 문자열 중복 제거
    List<String> names1 = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
    List<String> uniqueNames1 = names1.stream()
        .distinct()
        .sorted()
        .collect(Collectors.toList());

    System.out.println(uniqueNames1);
// [Alice, Bob, Charlie]

    List<String> names2 = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
    List<String> uniqueNames2 = names2.stream()
        .distinct()
        .sorted(Comparator.comparing(String::length)) // 글자 수 정렬
        .collect(Collectors.toList());

    System.out.println("커스텀 정렬 | " + uniqueNames2);

    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    List<Integer> firstThree1 = numbers1.stream()
        .limit(3)
        .collect(Collectors.toList());

    System.out.println("3개만 가져오기 : " + firstThree1);

    List<String> names3 = Arrays.asList("Alice", "Bob", "Charlie");
    long count = names3.stream()
                .count();

    System.out.println(count);

// 조건을 만족하는 요소 개수
    long longNames = names2.stream()
                    .filter(name -> name.length() > 4)
                    .count();

    System.out.println(longNames);
}

}
