package a26_0803.over;

public class Main4 {
    public static void main(String[] args) {
        // Student s1 = new Student();
        Student s2 = new Student("홍길동");
        Student s3 = new Student("이순신", 25);

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s3.name);
        System.out.println(s3.age);
    }
}
