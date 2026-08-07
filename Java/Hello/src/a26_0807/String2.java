package a26_0807;

public class String2 {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println(str.length()); // 문자 길이 반환
        System.out.println(str.charAt(6)); // 특정 인덱스 번호의 문자 반환

        String str1 = "Java";
        String str2 = "JAVA";

        System.out.println(str1.equals(str2)); // 대소문자 구분하여 비교
        System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 무시, 값만 비교

        // 문자열 검색 및 포함 여부
        String str3 = "Programmer";

        System.out.println(str3.indexOf("gram")); // 3
        System.out.println(str3.contains("pro")); // false 대소문자 구문
        System.out.println(str3.contains("Prog")); // true

        // 문자열 추출 및 자르기
        String str4 = "HelloWorld";

        System.out.println(str4.substring(5)); // 인덱스 번호 5번부터 끝까지 추출
        System.out.println(str4.substring(0, 5)); // 시작 인덱스 번호부터 마지막 인덱스 번호까지 추출

        String str5 = " Hello Java ";

        System.out.println(str5.replace("Java", "World")); // " Hello World "
        // "Java"를 "World"로 변경 추출
        System.out.println(str5.toLowerCase()); // " hello java "
        System.out.println(str.toUpperCase()); // " HELLO JAVA "
        System.out.println(str5.trim()); // "Hello Java" 앞 뒤 공백 제거

        // split 예제
        String fruits = "사과,바나나,포도";
        String[] arr = fruits.split(",");
        System.out.println(arr[1]); // 바나나

        // join 예제
        String joined = String.join("-", "2026", "08", "07");
        System.out.println(joined); // "2026-08-07" 단순 연결
    }
}
