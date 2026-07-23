package a0723;

import java.util.Scanner;

// 문제 1

// 숫자를 입력받아 양수인지 출력하세요.

// 입력 : 10

// 출력
// 양수입니다.

public class Scanner1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("숫자 입력 : ");

        int number = num.nextInt();

        if (number > 0) {
            System.out.println("양수입니다");
        }else {
            System.out.println("양수가 아닙니다.");
        }
    }
}
