package a26_0806.student;

import java.util.HashMap;
import java.util.Map;

public class StudentMap1 {
    public static void main(String[] args) {
        Map<String, Student1> studentMap = new HashMap<>();
        
        // 객체 저장
        studentMap.put("2025001", new Student1("홍길동", 20, 95));
        studentMap.put("2025002", new Student1("이순신", 21, 88));
        studentMap.put("2025003", new Student1("강감찬", 22, 91));

        System.out.println("====== 전체 학생 ======");
        for(String key : studentMap.keySet()) {
            System.out.println(key + " : " + studentMap.get(key));
        }

        // 특정 학생(2025002) 조회
        System.out.println("====== 특정 학생 ======");
        Student1 st = studentMap.get("2025002");
        System.out.println(st);

        // 특정 학생(2025002)의 점수 수정
        studentMap.get("2025002").setScore(100);
        System.out.println(studentMap.get("2025002"));

        // 특정 학생(2025003) 삭제
        studentMap.remove("2025003");
        System.out.println(studentMap);
        
        // 향상 for문으로 출력
        for(Map.Entry<String, Student1> entry : studentMap.entrySet()) {
            String num = entry.getKey();
            Student1 st1 = entry.getValue();

            System.out.println(num + " : " + st1);
        }
    }
}
