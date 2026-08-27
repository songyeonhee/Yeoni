package a26_0827.optional;

import java.util.Optional;

public class Optional2 {
  public static void main(String[] args) {
    // null일 수도 있는 데이터를 감쌈
    String input = null;

    Optional<String> opt = Optional.ofNullable(input);
    // ofNullable() 값이 있으면 넣고, null이면 빈 optional을 만듭니다.

    // 만약 값이 null이면 "기본 사용자"를 대신 반환
    String result = opt.orElse("기본 사용자");
    // optional 값이 있으면 그 값을 사용하고, 없으면 "기본 사용자"를 사용
    System.out.println(result);
  }
}
