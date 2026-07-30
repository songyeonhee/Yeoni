package a0730.student1;

public class St1Example {
    public static void main(String[] args) {
    //   Student1 st1 = new Student1();
    //   st1.name = "이사벨";
    //   st1.age = 17;
    //   st1.major = "디지털 컨텐츠 미디어";

    // 생성자 : 객체가 생성될 때 자동으로 실행되는 특별한 메서드
    // 객체를 만들면서 초기 값을 넣을 수 있다.
    Student1 st1 = new Student1("문동은", 30, "초등교육학");
    Student1 st2 = new Student1("박연진", 30, "방송연예");
    Student1 st3 = new Student1("이사라", 30, "서양화");

    // 생성한 객체의 정보를 출력
    System.out.println("==== 학생 정보 ====");
    st1.displayinfo();
    st2.displayinfo();
    st3.displayinfo();
    }
}
