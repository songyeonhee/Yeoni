package homework;

// 중첩 for문을 사용하여 3단 구구단만 출력하세요.
// [3 단]
// 3 X 1 = 3
// 3 X 2 = 6
// ...
// 3 X 9 = 27

public class Homework3 {
    public static void main(String[] args) {
        for(int i=3; i<=3; i++) {
            System.out.println("[ 구구단 " +i+ "단 ]");
            for(int j=1; j<=9; j++) {
            System.out.println(i + " X " +j+ " = "+(i*j));
            }
            }
        
    }
}
