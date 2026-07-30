package a26_0730.student2;

public class St1Example {
    public static void main(String[] args) {
    //   Student1 st1 = new Student1();
    //   st1.name = "이사벨";
    //   st1.age = 17;
    //   st1.major = "디지털 컨텐츠 미디어";

    // 생성자 : 객체가 생성될 때 자동으로 실행되는 특별한 메서드
    // 객체를 만들면서 초기 값을 넣을 수 있다.
    Student1 st1 = new Student1();
    Student1 st2 = new Student1();
    Student1 st3 = new Student1();

    st1.setName("홍길동");
    st1.setAge(20);
    st1.setMajor("전자공학");

    st2.setName("김수환");
    st2.setAge(30);
    st2.setMajor("정보처리");

    st3.setName("정점식");
    st3.setAge(22);
    st3.setMajor("영어영문");

    // 생성한 객체의 정보를 출력
    System.out.println("==== 학생 정보 ====");
    System.out.println(st1.getName());;
    System.out.println(st1.getAge());;
    System.out.println(st1.getMajor());;
    System.out.println();
    System.out.println(st1.getName());;
    System.out.println(st1.getAge());;
    System.out.println(st1.getMajor());;
    System.out.println();
    }
}
