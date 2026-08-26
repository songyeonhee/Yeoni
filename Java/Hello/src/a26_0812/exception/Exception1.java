package a26_0812.exception;

// 자바의 예외
// 프로그램 실행 중 발생하는 오류
// 0으로 나누기
// 존재하지 않는 배열로의 인덱스 접근
// 파일이 없는 경우
// 숫자가 아닌 문자를 숫자로 변환

public class Exception1 {
    public static void main(String[] args) {
        // 예외 발생
        int num = 10 / 0 ;
        System.out.println("프로그램 종료"); // 오류 발생
    }
}
