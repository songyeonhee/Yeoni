package a26_0731.member1;

import java.util.Scanner;

public class MemberMain {
    static Member[] memberList = new Member[100];
    static int memberCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            printMenu();
            String command = sc.nextLine();
            switch (command.toUpperCase()) {
                case "1":
                case "C":
                    createMember(sc);
                    break;

                case "2":
                case "R":
                    readMember();
                    break;

                case "3":
                case "U":
                    updateMember();
                    break;

                case "4":
                case "D":
                    deleteMember();
                    break;

                case "5":
                case "Q":
                    System.out.println("프로그램을 종료합니다.");
                    run = false;

                default:
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("==================================================");
        System.out.println("1(C) 회원등록 | 2(R) 회원조회 | 3(U) 회원수정 | 4(D) 회원삭제 | 5(Q) 종료");
        System.out.println("==================================================");
        System.out.println("선택 > ");
    }

    private static void createMember(Scanner sc) {
        if (memberCount >= 100) {
            System.out.println("더 이상 등록할 수 없습니다.");
            return;
        }
        int no = memberCount + 1;

        System.out.print("회원 이름 : ");
        String name = sc.nextLine();

        System.out.print("이메일 : ");
        String email = sc.nextLine();

        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());

        memberList[memberCount] = new Member(no, name, email, age);
        memberCount++;

        System.out.println("정상적으로 등록되었습니다.");
        System.out.println("회원 번호 : " + no);
        System.out.println("회원 이름 : " + name);
    }

    private static void readMember() {
        System.out.println("================ [ 등록 회원 목록 ] ================");
        if (memberCount == 1) {
            System.out.println("등록된 회원이 존재하지 않습니다.");
            return;
        }
        for (int i = 0; i < memberCount; i++) {
            Member m = memberList[i];
            System.out.printf("회원 번호 : %d번 | 이름 : %s | E-mail : %s| 나이 : %d세",
                    m.getNo(), m.getName(), m.getEmail(), m.getAge());
        }
    }

    private static void updateMember() {
        
    }

}