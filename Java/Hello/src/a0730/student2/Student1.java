package a0730.student2;

public class Student1 {
    // public 누구나 접근 가능 : 패키지 (폴더가 달라도 접근 가능)
    // default 같은 폴더에서만 접근 가능 
    // private 같은 클래스에서만 접근 가능
    // private 정보의 캡슐화, 은닉화
    private String name;
    private int age;
    private String major;

    // 객체 지향에서는 필드를 private로 감춤
    // 변수에 값을 입력(설정)하려면 setter 메소드
    // 변수에서 값을 가져오려면 getter 메소드

    //     public void setName(String string) {
    //     this.name = name;
    // }

    // Control + . = Generate Satters, Getters > 자동 생성

    public void displayinfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "세");
        System.out.println("전공 : " + major);
        System.out.println();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    // Getter 메소드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }


}
