package a26_0812.exception;

// 자바의 예외
// 프로그램 실행 중 발생하는 오류
// 0으로 나누기
// 존재하지 않는 배열로의 인덱스 접근
// 파일이 없는 경우
// 숫자가 아닌 문자를 숫자로 변환

public class Exception2 {
    public static void main(String[] args) {
        try {
            int num = 10 / 0 ;
        }
        catch (ArithmeticException e) { // 수학적 예외, 예외를 모를 경우 대표적인 Exception e로만 작성
            System.out.println("0으로 나눌 수 없습니다."); // 오류 발생
        }
        System.out.println("시스템 계속 실행");
    }
}
