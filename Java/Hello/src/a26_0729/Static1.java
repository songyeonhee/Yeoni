package a26_0729;

public class Static1 {
    // int num = 100;
    static int num = 100;

    public static void main(String[] args) {
        // main static - num은 일반 변수, 객체 생성없이 num 사용 불가
        System.out.println(num);
    }
}

// static: 공용이라는 개념 존재.
// 프로그램 전체에서 하나만 사용
// 학교 운동장

// 객체(new) : 객체마다 따로 사용
// 학생 정보 (회원 정보)
// 은행 정보 프로그램은 객체 사용하여 만들어야함