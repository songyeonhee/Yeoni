package a26_0807;

public class String3 {
    public static void main(String[] args) {
        String str = ""; // String : 불변 객체

        // 반목문 안에서 String 문자열 추가
        for(int i=0; i<100000; i++) {
            str += i; // 매번 새로운 String 객체 생성
        }

        System.out.println("완료");
    }
}
