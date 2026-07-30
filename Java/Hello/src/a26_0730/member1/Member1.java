package a26_0730.member1;

public class Member1 {
    public String name;
    public int age;
    public String eMail;

    public Member1(String name, int age, String eMail) {
        this.name = name;
        this.age = age;
        this.eMail = eMail;
    }

    public void displayinfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("이메일 : " + eMail);
    }

    

}
