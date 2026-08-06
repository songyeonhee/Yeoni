package a26_0722;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("==== 논리 연산자 ====");
            System.out.println("a = " + a + ", b = " + b);
    
        // AND 연산 (&&)
        System.out.println("\n==== AND 연산 (&&) ===="); // 전부 만족해야함
        System.out.println("a && b : " + (a && b));
        System.out.println("b && a : " + (b && a));
        
        // OR 연산 (||)
        System.out.println("\n==== Or 연산 (||) ====");
        System.out.println("a || b : " + (a || b));
        System.out.println("b || a : " + (b || a));

        // Not 연산 (!)
        System.out.println("\n==== Not 연산 (!) ====");
        System.out.println("!a : " + (!a));
        System.out.println("!a : " + (!b));

        // 복합 논리 연산
        System.out.println("\n=== 복합 논리 연산 ===");
        boolean x = true;
        boolean y = true;
        boolean z = false;

        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("x && y && z : " + (x && y && z)); // false 
        System.out.println("x || y || z : " + (x || y || z)); // true
        System.out.println("(x && y) || z : " + ((x && y) || z)); // true
        System.out.println("x && (y || z) : " + (x && (y || z))); // true

        // 실전 예제 #1
        // 봄 [3, 4, 5월] 여름 [6, 7, 8월] 가을 [9, 10, 11월] 겨울 [12, 1 ,2월]
        int season = 1;
        if(season >=3 && season <=5) {
            System.out.println("계절 : 봄");
        }else if(season >=6 && season <=8) {
            System.out.println("계절 : 여름");
        }else if(season >=9 && season <=11) {
            System.out.println("계절 : 가을");
        }else if(season == 12 || season == 1 || season==2) {
            System.out.println("계절 : 겨울");
        }else { // 그 외 나머지
            System.out.println("입력 값을 다시 확인해주십시오.");
        }

        // 실전 예제 #2
        // 복합 논리 연산 윤년 조건식

        int year = 2000;
        // 조건 1) 100의 배수가 아니면서 4의 배수이다.
        // 조건 3) 400의 배수이다.
       if((year%100 != 0 && year%4 == 0) || year%400 ==0) {
        System.out.println("True");
    }else{
        System.out.println("False");
    }

    }
}
