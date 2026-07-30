package a26_0724;
public class Math1 {
    public static void main(String[] args) {
        // 절대 값
        System.out.println("==== Math.abs() ====");
        System.out.println("abs(-10) = " + Math.abs(-10));
        System.out.println("abs(15) = " + Math.abs(15));

        // 최대 값, 최소 값
        System.out.println("==== Math.max(), Math.min() ====");
        System.out.println("max(20, 35) = " + Math.max(20, 35));
        System.out.println("min(20, 35) = " + Math.min(20, 35));

        // 거듭 제곱
        System.out.println("\n==== Math.pow() ====");
        System.out.println("2의 3제곱 = " + Math.pow(2, 3));
        System.out.println("5의 2제곱 = " + Math.pow(5, 2));

        // 제곱근
        System.out.println("\n==== Math.sqrt() ====");
        System.out.println("25의 제곱근 = " + Math.sqrt(25));
        System.out.println("81의 제곱근 = " + Math.sqrt(81));

        // 반올림
        System.out.println("\n==== Math.round() ====");
        System.out.println("round(3.2) = " + Math.round(3.2));
        System.out.println("round(3.5) = " + Math.round(3.5));
        System.out.println("round(3.8) = " + Math.round(3.8));

        // 난수 생성
        System.out.println("\n==== Math.random() ====");

        // 0 ~ 1 미만
        System.out.println("0 ~1미만 난수 = " + Math.random());

        // 1 ~ 10
        int num1 = (int)(Math.random() * 10) + 1;
        System.out.println("1 ~ 10 난수 = " + num1);

        // 1 ~ 45
        int lotto = (int)(Math.random() * 45) + 1;
        System.out.println("1 ~ 10 난수 = " + lotto);

        System.out.println("\n===== Math.PI =====");
        System.out.println("원주율 = " + Math.PI);

        // 원의 넓이
        double r = 5;
        double area = Math.PI * Math.pow(r, 2);

        System.out.printf("반지름 %.1f인 원의 넓이 = %.2f%n", r, area);
    }
}
