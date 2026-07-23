package a0723.Homework;

import java.util.Scanner;

// ## 문제 2. 합계 구하기

// 정수 5개를 입력받아 배열에 저장하고, 합계를 출력하세요.

// **실행 예시**

// ```
// 숫자 입력: 1
// 숫자 입력: 2
// 숫자 입력: 3
// 숫자 입력: 4
// 숫자 입력: 5
// 합계: 15
// ```

public class Homework2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;

        for(int i=0; i<number.length; i++) {
            System.out.print((i+1) + "번 째 숫자 입력 : ");
            number[i] = num.nextInt();
            sum += number[i];
        }

        System.out.println("합계 : " + sum);

        num.close();



    }
}
