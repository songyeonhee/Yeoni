package a26_0812.exception;

public class Exception3 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };

        try {
            System.out.println(arr[5]); // 존재하지 않는 인덱스 호출
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났습니다." + e.getMessage());
            e.printStackTrace();

            // e.getMessage() : 예외 메시지
            // e.printStackTrace(); : 예외 발생 위치, 호출 과정을 자세히 보여줌
        }
    }
}
