package a26_0728;

public class MethodEx11 {
    public static void main(String[] args) {
        int sum = total(90,80,70);

        System.out.println("총 점 : " + sum);
    }

    private static int total(int i, int j, int k) {
        return i+j+k;
    }
}
