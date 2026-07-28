package a0728;

// 문제 2: 짝수/홀수 판별기 (조건문 활용)
// 요구사항: 정수 하나를 매개변수로 받아, 
// 그 수가 짝수이면 true, 홀수이면 false를 반환하는 
// 메서드 isEven을 작성하세요.

// 메서드 시그니처 예시: public static boolean isEven(int num)

public class MethodPractice2 {
    public static void main(String[] args) {
        System.out.println(isEven(8));
    }

    private static boolean isEven(int a) {
        if(a%2==0) {
            return true;
        }else {
            return false;
        }
    }
}
