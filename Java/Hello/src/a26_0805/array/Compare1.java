package a26_0805.array;

public class Compare1 {
    public static void main(String[] args) {
        Student1[] students = new Student1[5];

        students[0] = new Student1("이사벨", 90, 80, 70);
        students[1] = new Student1("잭클린", 100, 95, 90);
        students[2] = new Student1("조나단", 90, 95, 90);
        students[3] = new Student1("그레이스", 90, 95, 90);

        students[1] = null;

        // System.out.println(students[0].getName());
        System.out.println();

        for(Student1 s : students) {
            System.out.println(s);
        }

        // 뒤의 데이터를 앞으로 이동
        for(int i=1; (i<students.length-1); i++) {
            students[i] = students[i+1];
        }

        // 마지막 칸은 null 처리
        students[students.length-1] = null;
        System.out.println();

        for(Student1 s : students) {
            System.out.println(s);
        }
    }
}
