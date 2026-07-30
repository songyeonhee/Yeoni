package a26_0724.homework;

// Java 연습 문제 (2026-07-24) 2-2 (코드 작성)
// {85, 90, 78, 92, 88}` 배열의 **최대값**을 찾아 출력하는 프로그램을 작성하세요.

public class Homework {
    public static void main(String[] args) {
       int[] num1 = {85, 90, 78, 92, 88};
       int max = 0;

       for (int i=0; i<num1.length; i++) {
        int result = num1[i];
        if(result > max) {
            max = result;
        }
       }
        System.out.print("max : " + max);
    }
}

    
