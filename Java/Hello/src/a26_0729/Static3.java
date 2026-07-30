package a26_0729;

// 일반 메소드
public class Static3 {
   public static void main(String[] args) {
    hello();
    // 함수도 static을 붙이면 객체 생성 불필요
   }

   private static void hello() {
    System.out.println("안녕하세요.");
   }
}
