package a26_0814.stream;

import java.util.Arrays;
import java.util.List;

public class stream03 {
    public static void main(String[] args) {
        List<Student> sts = Arrays
        .asList(new Student("alice", 20), new Student("Bob", 22));
        
    // 객체의 특정 필드 추출
        List<String> stNames = sts.stream()
                                  .map(Student::getName)
                                  .toList();

        System.out.println(stNames);
    }

    
}

class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}