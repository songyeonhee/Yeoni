package a26_0805.array;

import java.util.ArrayList;

import a26_0803.student.Student;

public class Compare2 {
    public static void main(String[] args) {
        ArrayList<Student1> students = new ArrayList<>();

        students.add(new Student1("이사벨", 90, 80, 70));
        students.add(new Student1("잭클린", 100, 95, 90));
        students.add(new Student1("조나단", 90, 95, 90));

        for(Student1 s : students) {
            System.out.println(s);
        }

        students.remove(1);
        System.out.println("==== 삭제 후 ====");
        for(Student1 s : students) {
            System.out.println(s);
        }
    }
}
