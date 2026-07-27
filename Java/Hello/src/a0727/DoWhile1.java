package a0727;

public class DoWhile1 {
    public static void main(String[] args) {
        int i=1; // 초기 값 while 바깥에서 설정

        do {
            System.out.println(i);
            i++;
        } //while(i<=5); 
        while(i<=0); 
        // do - while
        // 조건이 틀리더라도 한 번은 무조건 실행됨, 잘 사용하지 않음

    }
}
