package a0728;

// 문제 4: 문자열 반복 출력하기 (반복문 활용)
// 요구사항: 문자열(String)과 정수(int) 두 개를 매개변수로 받아, 
// 해당 문자열을 숫자만큼 반복해서 출력하는 
// 메서드 printMessage를 작성하세요. 
// (이 메서드는 반환값이 없습니다: void)

// 메서드 시그니처 예시: public static void printMessage(String text, int count)

public class MethodPractice4 {
    public static void main(String[] args) {
        str("여니짱", 3);
    }

    private static void str(String string, int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(string);
        }
}
}