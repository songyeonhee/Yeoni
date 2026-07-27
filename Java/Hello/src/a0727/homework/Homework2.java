package a0727.homework;

// 문제 2. 60점 이상만 출력하기

// 배열에 시험 점수가 저장되어 있습니다.
// int[] score = {45, 78, 90, 55, 62, 38, 81};
// 60점 이상인 학생만 출력하세요.
//60점 이상 학생의 평균
// 몇 명이 합격했는지도 출력하세요.

// 출력 예시
// 78
// 90
// 62
// 81
// 합격자 : 4명

public class Homework2 {
    public static void main(String[] args) {
        int[] score = {45, 78, 90, 55, 62, 38, 81};
        int pass = 0;
        int sum = 0;

        System.out.print("60점 이상 : ");

        for(int i=0; i<score.length; i++) {
            if(score[i] >= 60) {
                System.out.print(score[i] + "점" + " ");
                pass++;
                sum += score[i];
            }
        }
        System.out.println("\n합격자 : " + pass + "명");
        
        if(pass>0) {
            double avg=(double)sum/pass;
            System.out.printf("평균 : %.1f점%n", avg);
        }else {
            System.out.println("합격자가 없습니다.");
        }
        
        
    }
}
