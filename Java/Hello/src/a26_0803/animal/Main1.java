package a26_0803.animal;

// 상속을 하는 이유
// 같은 코드를 여러번 작성하지 않기 위해

// 코드 재사용
//유지 보수 용이
// 클래스간의 관계 표현 가능

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "초코";

        System.out.println(dog.name);
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.name = "후추";
        System.out.println(cat.name);
        cat.eat();
        cat.nyang();
    }
}
