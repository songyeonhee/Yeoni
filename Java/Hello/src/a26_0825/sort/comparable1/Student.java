package a26_0825.sort.comparable1;


public class Student implements Comparable<Student> {
  private String name;
  private int age;
  private int score;

  public Student(String name, int age, int score) {
    this.name = name;
    this.age = age;
    this.score = score;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getScore() {
    return score;
  }

  @Override
  public int compareTo(Student o) {

    return this.score - o.score;
  }

}
