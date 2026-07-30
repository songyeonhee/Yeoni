package a26_0727;

public class Max1 {
    public static void main(String[] args) {
        int[] score = {90, 85, 70, 100, 95};

        int max = score[0];

        // 최고 점수를 찾아 프린트해보세요.

        for(int i=1; i<score.length; i++) {
            if(score[i] >= max) {
                max = score[i];
            }
        }
        System.out.println("최고점 : "+ max);
    }
}
