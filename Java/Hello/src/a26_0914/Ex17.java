package a26_0914;

public class Ex17 {
  public static void main(String[] args) {
    Student s = new Student("홍길동", 20);
    s.introduce();
  }

}

class Student {

  String name;
  int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {
    System.out.println("나는 " + name + ", " + age + "살");
  }
}