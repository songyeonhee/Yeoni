package a0730.member2;

public class Member1 {
    private String name;
    private int age;
    private String eMail;


    public void displayinfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("이메일 : " + eMail);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String geteMail() {
        return eMail;
    }

    

}
