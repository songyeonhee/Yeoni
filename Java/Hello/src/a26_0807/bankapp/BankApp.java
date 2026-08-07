package a26_0807.bankapp;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        ArrayList<Bank1> accountList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while (run) {
            printMenu();
            int com;

            try {
                com = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("숫자만 입력 가능합니다.");
                continue;
            }

            switch (com) {
                case 1: // 계좌 생성
                createAccount(sc, accountList);
                break;
                
                case 2: // 계좌 목록 불러오기
                readAccount(accountList);
                break;
                
                case 3: // 입금
                deposit(sc, accountList);
                
                default:
                    System.out.println("오류가 발생하였습니다.");
                    break;
            }
        }
        sc.close();
    }

    private static void deposit(Scanner sc, ArrayList<Bank1> accountList) {
        System.out.println("=================");
        System.out.println("     #3 예금     ");
        System.out.println("=================");
        System.out.print("계좌 번호 입력 > ");
        String accNum = sc.nextLine();
        findAccountByAccNum(accountList, accNum);
    }

    private static Bank1 findAccountByAccNum(ArrayList<Bank1> accountList, String num) {
        for(Bank1 n : accountList) {
            if(n.getAno().equals(num))
                return n;
        }

        return null;
    }
    private static void printMenu() {
        System.out.println("=====================================================================");
        System.out.println("  #1 계좌 생성  |  #2 계좌 목록  |  #3 예금  |  #4 출금  |  #5 종료  ");
        System.out.println("=====================================================================");
        System.out.print("선택 > ");
    }

     private static void createAccount(Scanner sc, ArrayList<Bank1> accountList) {
        System.out.println("=================");
                System.out.println("  #1 계좌 생성  ");
                System.out.println("=================");

                System.out.print("계좌 번호 > ");
                String accNum = sc.nextLine();

                System.out.print("예금주 성명 > ");
                String accOwner = sc.nextLine();

                System.out.print("입금하실 금액 > ");
                int accBalance =+ Integer.parseInt(sc.nextLine()); 

                accountList.add(new Bank1(accNum, accOwner, accBalance));

                System.out.println("정상적으로 등록되었습니다.");
                System.out.println("계좌 번호 | " + accNum);
                System.out.println("예금주 명 | " + accOwner + "님");
                System.out.println("현재 잔액 | " + accNum + "원");

    }
    private static void readAccount(ArrayList<Bank1> accountList) {
        System.out.println("=================");
                System.out.println("  #2 계좌 목록  ");
                System.out.println("=================");
                if(accountList.isEmpty()) {
                    System.out.println("등록된 계좌가 존재하지 않습니다.");
                }
                else {
                    for(Bank1 ac : accountList) {
                    System.out.println(ac);
                    }
                }
    }        
    }

