package a0727;

public class Array1 {
    public static void main(String[] args) {
        int[][] score = {
            {90, 80},
            {70, 60},
            {100, 95}
        };

        for(int i=0; i<score.length; i++) { // 행의 개수
            for(int j=0; j<score[i].length; j++) { // 각 행에 속한 열의 개수
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
    }
}
