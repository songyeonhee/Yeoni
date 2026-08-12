package a26_0812.file.student1;

import java.io.File;
import java.io.FileWriter;

public class StudentSave {
    public static void main(String[] args) {
       Student[] students = { // 3명의 배열객체 생성
            new Student("홍길동",20,"컴퓨터공학"),
            new Student("김철수",21,"전자"),
            new Student("이영희",22,"AI")
            };
        File fd = new File("C:/abcdf");
        // 폴더 객체 생성 (실제 폴더를 만든 것은 아님)

        if (!fd.exists()) {
            fd.mkdir(); // 폴더가 없다면 폴더를 만듦
        }

        File file = new File("C:/abcdf/student.txt");
        // 파일 객체 생성 (실제 파일을 만든 것은 아님)

        try { // 권한 없음, 디스크 오류, 경로 오류 시 예외 발생 설정
            FileWriter fw = new FileWriter(file); // student.txt 생성
            for(Student s: students){
                fw.write("===== 학생 정보 =====\n");
                fw.write("이름 : " + s.getName() + "\n");
                fw.write("나이 : " + s.getAge() + "\n");
                fw.write("전공 : " + s.getMajor() + "\n");
            }
            fw.close();

            System.out.println("학생 정보 저장 완료");

        } catch (Exception e) {
            System.out.println("저장 실패");
        }
    }
}
