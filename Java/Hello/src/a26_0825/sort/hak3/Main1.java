package a26_0825.sort.hak3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1 {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choice = Integer.parseInt(sc.nextLine());

    switch (choice) {
      // Comparable - 정렬대상 클래스 내부 Student 클래스내부 - 정렬기준이 1개
      // 메서드는 compareTo() - 실무 활용이 적다.

      // Comparator - 별도 클래스(외부) - 정렬기준을 여러개
      // 메서드는 compare() - 실무활용이 많음
      case 1:
        // 이름으로 정렬
        Collections.sort(students, new NameComparator());
        break;

      case 2:
        // 이름으로 정렬
        Collections.sort(students, new AgeComparator());
        break;
      case 3:
        // 이름으로 정렬
        Collections.sort(students, new IdComparator());
        break;

      default:
        break;
    }

    Collections.sort(students);
    System.out.println("정렬 학생 목록");
    for (Student student : students) {
      System.out.println(student);
    }

  }
}

class Student implements Comparable<Student> {
  private String name;
  private int age;
  private int studentId;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public Student(String name, int age, int studentId) {
    this.name = name;
    this.age = age;
    this.studentId = studentId;
  }

  @Override
  public String toString() {
    return "student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
  }

  @Override
  public int compareTo(Student o) {
    return Integer.compare(this.age, o.age);
  }

}