package a26_0805.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
            list.add(new Student("홍길동", 90));
            list.add(new Student("김영희", 85));
            list.add(new Student("이철수", 78));

        while(run) {
            printMenu();
            int com;

            try {
                com = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("숫자만 입력 가능합니다.");
                continue;
            }

            switch (com) {
                case 1:
                    System.out.print("등록할 학생 이름 : ");
                    String name = sc.nextLine();

                    System.out.print("점수 입력 : ");
                    int score = Integer.parseInt(sc.nextLine());

                    list.add(new Student(name, score));
                    System.out.println("정상적으로 등록되었습니다." + "(" + name + ", " + score + "점)");
                   
                    break;

                case 2:
                    System.out.print("조회할 학생 이름 : ");
                    name = sc.nextLine();

                    Student stu = findStudent(list, name);

                    if(stu != null) {
                        System.out.println(stu);
                    }
                    else {
                        System.out.println("일치하는 학생이 없습니다.");
                    }
                    break;

                case 3:
                    System.out.print("수정할 학생 이름 : ");
                    name = sc.nextLine();

                    System.out.print("수정할 점수 입력 : ");
                    score = Integer.parseInt(sc.nextLine());
                    
                    if(UpdateStudent(list, name, score)) {
                        System.out.println("수정이 완료되었습니다." + "(" + name + ", " + score + "점)");
                    }
                    else {
                        System.out.println("일치하는 학생이 없습니다.");
                    }
                    break;
                
                case 4:
                    System.out.print("삭제할 학생 이름 : ");
                    name = sc.nextLine();

                    if(deleteStudent(list, name)) {
                        System.out.println("정상적으로 삭제되었습니다.");
                    }
                    else {
                        System.out.println("일치하는 학생이 없습니다.");
                    }                   
                break;
                
                case 5:
                    if(list.isEmpty()) {
                        System.out.println("등록된 학생이 없습니다.");
                    }
                    else {
                        for(Student s : list) {
                            System.out.println(s);
                        }
                    }
                break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                break;
                
                default:
                    break;
            }
        }
        sc.close();
    }

    private static void printMenu() {
        System.out.println("=======================");
        System.out.println("[1] 학생 등록");
        System.out.println("[2] 학생 검색");
        System.out.println("[3] 학생 수정");
        System.out.println("[4] 학생 삭제");
        System.out.println("[5] 전체 출력");
        System.out.println("[6] 종료");
        System.out.println("=======================");
        System.out.print("선택 > ");
    }

    private static Student findStudent(ArrayList<Student> list, String name) {
       for(Student s : list) {
        if(s.getName().equals(name)) {
            return s;
        }
       }
       return null;
    }

    private static boolean UpdateStudent(ArrayList<Student> list, String name, int newScore) {
        for(Student s : list) {
            if(s.getName().equals(name)) {
                s.setScore(newScore);
                return true;
            }
        }
        return false;
    }

    private static boolean deleteStudent(ArrayList<Student> list, String name) {
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                list.remove(i);
                return true;
            }
        }
        return false;
    }

}
