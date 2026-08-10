package a26_0810.ramda;

// 무엇을 할지만 정의
interface Calculator {
    int sum(int a, int b);
    // 추상 메소드 하나만 가지고 있음
    // 정수 두 개를 입력받아 정수 하나만 반환
}


public class Ramda2 {
    public static void main(String[] args) {

    // public int sum(int a, int b) {
    //     return a + b; }
    // == (a, b) -> a+b; 동일
    // 원래는 int sum(int a, int b) 였지만, 인터페이스에서 이미 int 자료형으로 정의하여 (a, b)로 축약 (람다)
    // -> : 입력을 받아 실행하라는 의미
    
        // 익명 클래스 (이름이 없는 클래스)
        Calculator mc = (a, b) -> a+b;
        int result = mc.sum(3,4);
        System.out.println("result = " + result);
    }
}
