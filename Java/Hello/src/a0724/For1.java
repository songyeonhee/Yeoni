public class For1 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }

        for (int j=5; j>=1; j--){
            System.out.println(j);
        } // 5 4 3 2 1 출력

        for (int k=2; k<=10; k += 2){
            System.out.println(k);
        } // 2 4 6 8 10 출력



        int[] score = {90, 85, 78, 95, 88};
        int sum = 0;
        for(int i=0; i<score.length; i++) {
            // System.out.println(score[i]);
            sum += score[i];
        }
        double avg = (double) sum / 5;
         System.out.println("총 점 : " + sum);
         System.out.println("평균 : " + avg);

         // 향상 for문
         for(int s: score) {
            System.out.println(s);
         }
    }
}
