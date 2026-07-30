package a26_0728;

public class MethodEx01 {
    public static void main(String[] args) {
        // 함수(Method, Function)는 특정 기능을 수행하는 코드의 묶음
        // 자주 사용하는 코드를 한 곳에 작성하고 필요 시 호출
        hello();
        hello();
    }

    // private(접근 제어자) : MethodEx01 내에서만 호출 가능
    // private 대신 public이 많이 쓰임
    public static void hello() {
        // static : 객체 생성 없이 호출 가능
        System.out.println("안녕하세요");
    }

}
