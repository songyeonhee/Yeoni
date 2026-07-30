package a26_0723;

public class If5 {
    public static void main(String[] args) {
        // int age = 25;
        // if (age >= 20 && age <30))

        int age = 17;
        if (age <19 || age >=65) {
            // 둘 중에 한 조건만 만족하면 할인해주겠다는 의미
            System.out.println("할인 대상입니다.");
        } else {
            System.out.println("일반 요금입니다.");
        }

    }
}
