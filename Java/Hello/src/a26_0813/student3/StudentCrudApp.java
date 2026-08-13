package a26_0813.student3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCrudApp {
    private static final String FILE_NAME = "students.txt"; // 상수
    private static List<Student> stArr = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        loadFromFile();

        while (true) {
            System.out.println("\n========== 학생 관리 시스템 (CRUD) ==========");
            System.out.println("1. 학생 조회 (Read)");
            System.out.println("2. 학생 등록 (Create)");
            System.out.println("3. 학생 수정 (Update)");
            System.out.println("4. 학생 삭제 (Delete)");
            System.out.println("5. 프로그램 종료 (Exit)");
            System.out.print("메뉴 선택: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.");
                continue;
            }

            switch (choice) {
                case 1:
                    readStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 선택해주세요.");
            }
        }
    }

    private static void deleteStudent() {
        System.out.println("\n--- [학생 정보 삭제] ---");
        System.out.print("삭제할 학번 입력 > ");
        String id = sc.nextLine();
        // boolean removed = false;

        // for (int i = 0; i < stArr.size(); i++) {
        //     if (stArr.get(i).getId().equals(id)) {
        //     stArr.remove(i);
        //     removed = true;
        //     break;
        //     }
        // }

        boolean removed = stArr.removeIf(s -> s.getId().equals(id));

        if(removed) {
            saveToFile(); // 삭제 후 변경사항 저장
            System.out.println("학생 정보가 성공적으로 삭제되었습니다.");
        }
        else {
            System.out.println("해당하는 학번의 학생을 찾을 수 없습니다.");
        }
    }

    private static void updateStudent() {
        System.out.println("\n--- [학생 정보 수정] ---");
        System.out.print("수정할 학번 입력 > ");
        String id = sc.nextLine();

        Student target = null;
        for(Student s : stArr) {
            if(s.getId().equals(id)){
                target = s;
                break;
            }
        }
        if(target == null){
            System.out.println("해당하는 학번의 학생을 찾을 수 없습니다.");
            return;
        }
        System.out.print("새로운 이름 (기존: " + target.getName() + ", 변경 안 하려면 엔터): ");
        String name = sc.nextLine();
        System.out.print("새로운 나이 (기존: " + target.getAge() + ", 변경 안 하려면 엔터): ");
        String ageStr = sc.nextLine();

        if (!name.isEmpty()) {
            target.setName(name);
        }
        if (!ageStr.isEmpty()) {
            try {
                target.setAge(Integer.parseInt(ageStr));
            } catch (NumberFormatException e) {
                System.out.println("나이 형식 오류로 나이는 수정되지 않았습니다.");
            }
        }

        saveToFile(); // 변경사항 파일에 반영
        System.out.println("학생 정보가 수정되었습니다.");
    }

    private static void createStudent() {
        System.out.println("\n--- [학생 정보 등록] ---");
        System.out.print("학번 입력 > ");
        String id = sc.nextLine();
        System.out.print("이름 입력 > ");
        String name = sc.nextLine();
        System.out.print("나이 입력 > ");
        
        int age; // 나이 예외 처리
        try {
            age = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("나이는 숫자만 입력 가능합니다.");
            return;
        }

        stArr.add(new Student(id, name, age));
        saveToFile(); // 추가 사항 파일에 반영
        System.out.println("새로운 학생이 성공적으로 등록되었습니다.");
    }

    private static void readStudents() {
        System.out.println("\n--- [학생 목록 조회] ---");
        if(stArr.isEmpty()) { // 리스트가 비어있을 떄
            System.out.println("등록된 학생이 존재하지 않습니다.");
            return;
        }
        for(int i=0; i<stArr.size(); i++) {
            Student s = stArr.get(i);
            System.out.printf("%d. 학번: %s | 이름: %s | 나이: %d\n", (i + 1), s.getId(), s.getName(), s.getAge());
        }
    }

    private static void loadFromFile() {
        File file = new File(FILE_NAME); // "students.txt" 객체로 지정

        if(!file.exists()) {
            System.out.println("저장된 파일이 없어 기본 더미 데이터를 생성합니다.");
            stArr.add(new Student("2026001", "홍길동", 20));
            stArr.add(new Student("2026002", "김철수", 22));
            stArr.add(new Student("2026003", "이영희", 21));
            // 현재는 메모리에만 저장됨

            saveToFile();
        }
        else { // 파일이 있으면 학생을 불러옴
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while((line = reader.readLine()) != null) { 
                    Student s = Student.fromString(line); // 객체 생성 없이 메서드 호출할 때
                    if (s != null) {
                        stArr.add(s); // 생성된 객체를 리스트에 추가
                    }
                }
                System.out.println("학생 데이터를 성공적으로 불러왔습니다.");
            }
            catch (Exception e) {
            System.out.println("데이터 로드 중 오류 발생");
            System.out.println(e.getMessage());
            }
        }
    }

    private static void saveToFile() {
        // BufferedWriter : 한꺼번에 저장 가능 (속도 빠름)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
        // 파일을 열어서 문자로 저장
            for(Student s : stArr) {
                writer.write(s.toString());
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println("파일 저장 중 오류 발생");
            System.out.println(e.getMessage());
        }
    }
}
