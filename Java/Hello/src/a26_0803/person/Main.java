package a26_0803.person;

public class Main extends Object{
    public static void main(String[] args) {
        Person p1 = new Person("잭클린", 54);
        Person p2 = new Person("이사벨", 17);

        // System.out.println(p1.getName());
        // System.out.println(p1.getAge());
        // System.out.println(p2.getName());
        // System.out.println(p2.getAge());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
