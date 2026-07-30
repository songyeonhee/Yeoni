package a26_0727;

public class Reverse {
    public static void main(String[] args) {
        // 배열을 거꾸로 출력
        
        int[] num = {10, 20, 30, 40, 50};
        for(int i=num.length-1; i>=0; i--) {
            System.out.print(num[i]+" ");
        }

    }
}
