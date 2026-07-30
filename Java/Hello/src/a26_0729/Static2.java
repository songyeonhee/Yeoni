package a26_0729;

public class Static2 {
    // int num = 100;
    int num = 100;

    public static void main(String[] args) {
        // main static - num은 일반 변수, 객체 생성없이 num 사용 불가

        Static2 st = new Static2(); // 객체 생성
        System.out.println(st.num);
    }
}
