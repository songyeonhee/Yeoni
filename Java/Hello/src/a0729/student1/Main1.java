package a0729.student1;

public class Main1 {
    public static void main(String[] args) {
        // main 안에 있는 내용을 가장 먼저 실행함
        
        Student1 s1 = new Student1();
        //Student1으로 s1이라는 객체를 생성
        Student1 s2 = new Student1();

        s1.name = "홍길동";
        s1.age = 25;

        s1.hello();

        s2.name = "이사벨";
        s2.age = 17;

        s2.hello();

        System.out.println(s1.name);
        System.out.println(s1.age);

        System.out.println(s2.name);
        System.out.println(s2.age);


    }
}
