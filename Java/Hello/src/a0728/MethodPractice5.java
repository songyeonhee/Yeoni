package a0728;

// 문제 5: 학점 계산기 (복합 조건)
// 요구사항: 점수(정수)를 매개변수로 받아, 
// 아래 기준에 따라 학점 문자(char)를 반환하는 
// 메서드 getGrade를 작성하세요.

// 90점 이상: 'A'
// 80점 이상 ~ 90점 미만: 'B'
// 70점 이상 ~ 80점 미만: 'C'
// 70점 미만: 'F'

// 메서드 시그니처 예시: public static char getGrade(int score)

public class MethodPractice5 {
    public static void main(String[] args) {
        System.out.println(getGrade(95));
    }

    private static char getGrade(int score) {
        if(score>=90) {
            return 'A';
        }else if(score<90 && score>=80) {
            return 'B';
        }else if(score<80 && score>=70) {
            return 'C';
        }else {
            return 'F';
        }
    }
    
}
