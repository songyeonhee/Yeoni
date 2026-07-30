package a26_0721;

public class Var1 {
    public static void main(String[] args) { // main + Tab
        // 변수(Variable) : 데이터를 저장하는 공간
        String name1 = "송연희"; // 문자
            System.out.println(name1); // sout + Tab
        int age = 30; // 정수
            System.out.println(age);
        double height = 175.5; // 실수
            System.out.println(height);

            System.out.println("이름 : " + name1);
            System.out.println("나이 : " + age);

        int score = 80;
            System.out.println(score);
        score = 100;  //기존에 선언했던 80이라는 변수를 100으로 바꿈
            System.out.println(score); // 언제든지 변하는 수가 "변수"
    }
    
}
