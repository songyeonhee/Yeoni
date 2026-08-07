package a26_0807;

public class String1 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("Java"); // 객체로 생성 시 다른 주소를 가짐
        System.out.println(str1 == str3); // false 주소 비교
        System.out.println(str1.equals(str3)); // true 값(내용) 비교 ("Java"와 "Java")
        // 값을 비교할 때에는 반드시 equals 사용
    }
}
