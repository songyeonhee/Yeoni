package a26_0810.ramda;

// 무엇을 할지만 정의
interface Calculator {
    int sum(int a, int b);
}

// implements : Calculator라는 인터페이스를 구현
class MyCalculator implements Calculator {

    @Override // 부모의 메소드를 재정의(구현)
    public int sum(int a, int b) {
        return a+b;
    }
    
}

public class Ramda1 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator(); // 객체 생성
        int result = mc.sum(3,4);
        System.out.println("result = " + result);
    }
}
