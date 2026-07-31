package a26_0731.member1;

public class Member {
    private int no; // 관리 번호
    private String name; // 회원 이름
    private String email; // 이메일
    private int age; // 나이

    public Member(int no, String name, String email, int age) {
        this.no = no;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    } 
}
