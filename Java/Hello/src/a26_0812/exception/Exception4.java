package a26_0812.exception;

public class Exception4 {
    public static void main(String[] args) {
        String str = "ABC";

        try {
            int num = Integer.parseInt(str); 
            // 문자 형식으로된 숫자를 숫자 형식으로 변환, 변환할 수 없는 문자인 ABC가 입력되어 예외 처리

        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력하세요.");
        }
    }
}
