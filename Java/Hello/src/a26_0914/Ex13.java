package a26_0914;

public class Ex13 {
  public static void main(String[] args) {
    int[] scores = { 90, 80, 70, 100, 60 };
    int sum = 0;
    int avg;

    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    avg = sum / scores.length;

    System.out.println("합계 : " + sum);
    System.out.println("평균 : " + avg);
  }
}