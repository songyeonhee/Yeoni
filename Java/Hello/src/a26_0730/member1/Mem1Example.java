package a26_0730.member1;

public class Mem1Example {
    public static void main(String[] args) {
        Member1 mem1 = new Member1("홍길동", 25, "hong@test.com");
        Member1 mem2 = new Member1("김철수", 30, "kim@test.com");
        Member1 mem3 = new Member1("이영희", 22, "lee@test.com");

        mem1.displayinfo();
        System.out.println();

        mem2.displayinfo();
        System.out.println();
        
        mem3.displayinfo();
      
    }

    
}
