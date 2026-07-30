package a26_0727;

public class While1 {
    public static void main(String[] args) {
        int i=1; // 초기 값 while 바깥에서 설정

        while(i<=5) { // 조건식 (최종 값)
            System.out.println(i);

            i++; // 증감식
        }
    }
}
