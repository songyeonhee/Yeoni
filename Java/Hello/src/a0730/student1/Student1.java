package a0730.student1;

public class Student1 {
    // public 누구나 접근 가능 : 패키지 (폴더가 달라도 접근 가능)
    // default 같은 폴더에서만 접근 가능 
    public String name;
    public int age;
    public String major;

    // public Student1(String name, int age, String major) {
    //     this.name = name;
    //     this.age = age;
    //     this.major = major;
    // }

    // 생성자 - 생성 메소드
    // 클래스 이름 == 생성자 : 이름이 같다
    // 생성자는 반환이 없다 (void)

    // public void displayinfo() {
    //     System.out.println("이름 : " + name);
    //     System.out.println("나이 : " + age + "세");
    //     System.out.println("전공 : " + major);
    // }

    public Student1(String n, int a, String m) {
        this.name = n;
        this.age = a;
        this.major = m;
    }

    public void displayinfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "세");
        System.out.println("전공 : " + major);
    }
}
