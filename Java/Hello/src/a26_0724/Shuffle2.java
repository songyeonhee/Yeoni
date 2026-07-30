package a26_0724;
public class Shuffle2 {
    public static void main(String[] args) {
        int[] numbers = new int[44];

        int ranNum = (int)((Math.random()*45)+1);

        for(int i=0; i<=44; i++) {
            numbers[i] = ranNum;
        } 

    }
}
