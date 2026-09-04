package a26_test.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    boolean run = true;

    while (run) {
      System.out.println("------------------------");
      System.out.println("1. 학생 등록");
      System.out.println("2. 학생 검색");
      System.out.println("3. 학생 수정");
      System.out.println("4. 학생 삭제");
      System.out.println("5. 전체 출력");
      System.out.println("6. 종료");
      System.out.print("선택 > ");

      int com;
      try {
        com = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("숫자만 입력하세요");
        continue;
      }

      switch (com) {
        case 1: // 학생 등록
          createStudent(sc, students);
          break;

        case 2: // 학생 검색
          findStudent(sc, students);
          break;

        case 3: // 학생 수정
          int newAge;
          System.out.print("이름 입력 : ");
          String name = sc.nextLine();

          while (true) {
            System.out.print("수정할 나이 : ");
            try {
              newAge = Integer.parseInt(sc.nextLine());
              break;
            } catch (NumberFormatException e) {
              System.out.println("나이는 숫자로 입력하세요");
            }
          }

          boolean result = updateStudent(students, name, newAge);

          if (result) {
            System.out.println("수정 완료");
          } else {
            System.out.println("해당 학생이 없습니다");
          }
          break;

        case 4: // 학생 삭제
          deleteStudent(sc, students);
          break;

        case 5: // 전체 출력
          readStudent(students);
          break;

        case 6: // 프로그램 종료
          System.out.println("프로그램을 종료합니다.");
          run = false;
          break;

        default:
          System.out.println("1~6번 중에 선택하세요");
          break;
      }
    }
  }

  // 학생 삭제
  private static void deleteStudent(Scanner sc, ArrayList<Student> list) {
    System.out.print("이름 입력 : ");
    String name = sc.nextLine();
    Student findStudent = findStudentByName(name, list);

    if (findStudent != null) {
      list.remove(findStudent);
      System.out.println("삭제 완료");
    } else {
      System.out.println("삭제할 학생이 없습니다.");
    }
  }

  // 학생 수정
  static boolean updateStudent(ArrayList<Student> list, String name, int newAge) {
    Student findStudent = findStudentByName(name, list);
    if (findStudent != null) {
      findStudent.age = newAge;
      return true;
    } else {
      return false;
    }
  }

  // 학생 검색
  static void findStudent(Scanner sc, ArrayList<Student> list) {
    System.out.print("이름 입력 : ");
    String name = sc.nextLine();
    Student findStudent = findStudentByName(name, list);

    if (findStudent != null) {
      System.out.println(findStudent);
    } else {
      System.out.println("학생이 없습니다");
    }
  }

  // 입력값과 일치하는 객체 반환
  static Student findStudentByName(String name, ArrayList<Student> list) {
    for (Student s : list) {
      if (s.name.equals(name)) {
        return s;
      }
    }
    return null;
  }

  // 전체 출력
  static void readStudent(ArrayList<Student> list) {
    if (list.isEmpty()) {
      System.out.println("등록된 학생이 없습니다");
    } else {
      for (Student s : list) {
        System.out.println(s);
      }
    }
  }

  // 학생 등록
  static void createStudent(Scanner sc, ArrayList<Student> list) {
    System.out.print("이름 입력 : ");
    String name = sc.nextLine();
    int age;
    while (true) {

      System.out.print("나이 입력 : ");
      try {
        age = Integer.parseInt(sc.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("나이는 숫자로 입력하세요");
      }
    }
    list.add(new Student(name, age));
    System.out.println("학생 등록 완료");

  }
}
