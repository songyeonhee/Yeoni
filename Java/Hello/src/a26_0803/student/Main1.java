package a26_0803.student;

public class Main1 {
 public static void main(String[] args) {
    Student[] students = new Student[5];
    // Create (더미 데이터)

    students[0] = new Student("홍길동", 90, 80, 70, 0, 0);
    students[1] = new Student("이순신", 100, 95, 90, 0, 0);
    students[2] = new Student("김유신", 85, 88, 91, 0, 0);
    students[3] = new Student("강감찬", 77, 80, 83, 0, 0);
    students[4] = new Student("신사임당", 95, 98, 100, 0, 0);

    // read
    System.out.println("===== 학생 목록 =====");
    printStudents(students);

    // update
    System.out.println("\n======= 수정 =======");
    updateStudent(students, "홍길동", 100, 100, 100);

    
 }

 
 private static void printStudents(Student[] students) {
    System.out.println("==========================================");
    System.out.println("이름     국어 영어 수학 총점 평균");
    System.out.println("==========================================");
    // for(int i=0; i<students.length; i++) {
    //     if(students[i] !=null) {
    //         students[i].printlnfo();
    //     }
    // }

    for(Student s:students) {
        if(s != null) {
            s.printlnfo();
        }
    }
 }   
 private static void updateStudent(Student[] students, String name, int kor, int eng, int math) {
    for(Student s: students) {
        if(s != null && s.getName().equals(name)) {
            s.setKor(kor);
            s.setEng(eng);
            s.setMath(math);
            System.out.println(name + " 학생 수정 완료");
            return;
        }
    }
}

}
