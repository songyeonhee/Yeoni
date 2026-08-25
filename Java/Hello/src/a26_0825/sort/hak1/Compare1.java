package a26_0825.sort.hak1;

public class Compare1 {
  public static void main(String[] args) {
    String str1 = "apple";
    String str2 = "banana";
    String str3 = "apple";
    // CompareTo : 두 문자열을 사전식으로 비교

    System.out.println(str1.compareTo(str2)); // -1
    // 아스키 코드로 비교했을 때 str1(97)이 str2(98)보다 작음

    System.out.println(str1.compareTo(str3)); // 0
    // 아스키 코드로 비교했을 때 같은 값

    System.out.println(str2.compareTo(str1)); // 1
  }
}
