package a26_0727.homework;

// 문제 1. 최고 점수 학생 찾기 

// 학생들의 점수가 저장된 배열입니다.
// int[] score = {85, 92, 78, 96, 88};

// 다음을 출력하세요.
// 최고 점수
// 몇 번째 학생인지 (1번부터 시작)

// 출력 예시
// 최고 점수 : 96
// 4번째 학생

public class Homework1 {
    public static void main(String[] args) {
        int[] score = {85, 92, 78, 96, 88};

        int max = score[0];
        int turn = 1;

        for(int i=1; i<score.length; i++) {
            if(score[i]>max) {
                max = score[i];
                turn = i+1;
            }
        }

        System.out.println("최고 점수 : " + max + "점");
        System.out.println(turn+"번째 학생");
    }
}
