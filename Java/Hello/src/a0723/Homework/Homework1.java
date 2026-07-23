package a0723.Homework;

import java.util.Scanner;

// 1. 숫자 3개 입력 후 출력

// 정수 3개를 입력받아 배열에 저장하고, for문으로 모두 출력하세요.

// **실행 예시**

// ```
// 숫자 입력: 10
// 숫자 입력: 20
// 숫자 입력: 30
// 10
// 20
// 30
// ```
public class Homework1 {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        int[] number = new int[3];
        number[i] = nm.nextInt();
        

        for(int i=0; i<3; i++) {
            System.out.print("숫자를 입력해주세요. : ");
            System.out.println((i+1) + "번 째 숫자 : " + number[i]);
        }
           

           

    }
}
