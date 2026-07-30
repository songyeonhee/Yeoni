package a26_0728;

public class MethodEx03 {
    public static void main(String[] args) {
        // 매개변수(parameter)는 함수에 전달하는 값
        hello("홍길동");
        hello("김철수");
    }

    public static void hello(String name) {
        System.out.println(name + "님 환영합니다 !");
    }
}
