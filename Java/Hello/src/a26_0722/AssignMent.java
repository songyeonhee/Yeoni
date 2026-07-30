package a26_0722;

public class AssignMent {
    public static void main(String[] args) {
        System.out.println("===기본 대입 연산자===");
        int a = 10;
            System.out.println("a = 10 : " + a);


        // += 연산자
        System.out.println("\n===복합 대입 연산자===");
        int num1 = 10;
            System.out.println("초기 값 : " + num1);
        num1 +=5; // num1 + 5을 계산한 후 자신에게 다시 할당
            System.out.println("num1 += 5 : " + num1);

        // -= 연산자
        int num2 = 20;
        num2 -=8;
            System.out.println("num2 -= 8 : " + num2);

        // *= 연산자
        int num3 = 5;
        num3 *=3;
            System.out.println("num3 *= 3 : " + num3);
        
        // /= 연산자
        int num4 = 20;
        num4 /= 4;
            System.out.println("num4 /= 4 : " + num4);

        // %= 연산자
        int num5 = 17;
        num5%=5;
            System.out.println("num5 %= 5 : " + num5);

        System.out.println("\n===복합 대입 연산자 연속 사용===");
        int value = 10;
            System.out.println("초기 값 : " + value);

        value +=5;
            System.out.println("value += 5 : " + value);

        value -=3;
            System.out.println("value -= 3 : " + value);

        value *=2;
            System.out.println("value *= 2 : " + value);

        value /=4;
            System.out.println("value /= 4 : " + value);

        value %=4;
            System.out.println("value %= 4 : " + value);

            System.out.println("\n최종 값 : " + value);

        System.out.println("\n===실용적인 예제===");
        int sum = 0;
        sum +=10;
        sum +=25;
        sum +=30;
            System.out.println("합계 : "+ sum);
            System.out.println("평균 : " + (sum/3));
            // System.out.println("평균 : " + (double) (sum/3)); > 21.0
            // double avg1 = sum / 3 > 21.0
            
            double avg = (double)sum / 3;
            double avg1 = sum / 3.0;

            System.out.println("avg : " + avg);
            System.out.println("avg1 : " + avg1);

    }
}