package a0728;

import java.util.Scanner;

// =====================
// 계산기
// =====================
// 1. 더하기
// 2. 빼기
// 3. 곱하기
// 4. 나누기
// 5. 종료
// =====================

public class Homework {
    static Scanner sc = new Scanner(System.in);
    static int result = 0;


    public static void calc() {
        System.out.println("\n==================================");
        System.out.println("             계산기");
        System.out.println("==================================");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("5. 종료");
        System.out.print("작업 선택 : ");
    }
    public static void main(String[] args) {
        while(true) {
            calc();

            int menuNum = sc.nextInt();

            switch(menuNum) {
                case 1:
                    add();
                    break;

                case 2:
                    min();
                    break;

                case 3:
                    mul();
                    break;

                case 4:
                    div();
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default :
                System.out.println("입력 값이 잘못되었습니다.");
            }
        }
    }

    private static int input(int i, int j) {
        System.out.print("Number 1) ");
        int i = sc.nextInt();

        System.out.print("Number 2) ");
        int j = sc.nextInt();
    }
    

    private static int add() {

        result = num1+num2;

        System.out.print(num1 + " + " + num2 + " = ");
        System.out.println(result);

        return a+b;
    }

    private static void min() {
        System.out.print("Number 1) ");
        int num1 = sc.nextInt();

        System.out.print("Number 2) ");
        int num2 = sc.nextInt();

        result = num1-num2;

        System.out.print(num1 + " - " + num2 + " = ");
        System.out.println(result);
    }

    private static void mul() {
        System.out.print("Number 1) ");
        int num1 = sc.nextInt();

        System.out.print("Number 2) ");
        int num2 = sc.nextInt();

        result = num1*num2;

        System.out.print(num1 + " X " + num2 + " = ");
        System.out.println(result);
    }

    private static void div() {
        System.out.print("Number 1) ");
        int num1 = sc.nextInt();

        System.out.print("Number 2) ");
        int num2 = sc.nextInt();

        if(num2==0) {
            System.out.print("0으로 나눌 수 없습니다.");
        }else {
            result = num1/num2;

            System.out.print(num1 + " / " + num2 + " = ");
            System.out.println(result);}
    }
    
    
}
