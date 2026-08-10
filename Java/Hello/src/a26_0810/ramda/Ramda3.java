package a26_0810.ramda;

interface Calculator {
    int sum(int a, int b);
}

public class Ramda3 {
    public static void main(String[] args) {

        Calculator mc = Integer::sum; // Integer::min; Integer::max;
        // Integer::sum > 이미 만들어진 메소드, sum을 이름으로 연결 (메소드 참조)
        int result = mc.sum(3,4);
        System.out.println("result = " + result);
    }
}
