package a26_0728;

// 두 개의 숫자 중 큰 수 구하기

public class MethodEx05 {
    public static void main(String[] args) {
        System.out.println(max(50, 20));
    }

    private static int max(int a, int b) {
        // 두 수가 같은 경우는 제외
        if(a>b) {
            return a;
        }else {
            return b;
        }
    }
}
