package a26_0812.exception;

public class Exception2_1 {
    public static void main(String[] args) {
        try {
            int num = 10 / 0 ;
        } 
        catch (Exception e) { // e에는 오류 정보가 담겨져있음
            System.out.println(e); // java.lang.ArithmeticException: / by zero
            System.out.println(e.getMessage()); // by zero
            e.printStackTrace(); // java.lang.ArithmeticException: / by zero
                                 // at a26_0812.Exception2_1.main(Exception2_1.java:6)
        }
        System.out.println("시스템 계속 실행");
    }
}
