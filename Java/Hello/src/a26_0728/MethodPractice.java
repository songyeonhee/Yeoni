package a26_0728;

public class MethodPractice {
    public static void main(String[] args) {
        // 문제 1: 덧셈 메서드 (기본)
        // 요구사항: 두 개의 정수를 매개변수로 받아, 
        // 두 수의 합을 반환(return)하는 메서드 add를 작성하고 
        // main 메서드에서 호출해 결과를 출력하세요.
        int result = add(7, 14);
        System.out.println(result);
    }

    private static int add(int i, int j) {
    return i+j;
    }
}
