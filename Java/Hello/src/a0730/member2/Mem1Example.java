package a0730.member2;

public class Mem1Example {
    public static void main(String[] args) {
        Member1 mem1 = new Member1();
        Member1 mem2 = new Member1();
        Member1 mem3 = new Member1();

        mem1.setName("문동은");
        mem1.setAge(30);
        mem1.seteMail("moon@test.com");
      
        mem2.setName("박연진");
        mem2.setAge(30);
        mem2.seteMail("jin@test.com");

        mem3.setName("이사라");
        mem3.setAge(30);
        mem3.seteMail("sarah@test.com");

        System.out.println(mem1.getName());
        System.out.println(mem1.getAge());
        System.out.println(mem1.geteMail());
        System.out.println();

        System.out.println(mem2.getName());
        System.out.println(mem2.getAge());
        System.out.println(mem2.geteMail());
        System.out.println();

        System.out.println(mem3.getName());
        System.out.println(mem3.getAge());
        System.out.println(mem3.geteMail());
    }

    
}
