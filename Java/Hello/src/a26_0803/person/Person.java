package a26_0803.person;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
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

    // 자바의 모든 클래스는 최상위 클래스인 Object를 상속받기 때문에 
    // toString() 메서드를 기본적으로 가지고 있다.
    // toString() : 재정의(오버라이딩)
    // 객체 정보를 보기좋게 출력하려면 to String 오버라이딩
    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age +"]";
    }

    

    
}
