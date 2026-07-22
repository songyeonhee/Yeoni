package a0721;

public class Var3 {
    public static void main(String[] args) {
        int var1 = 10;
            System.out.println(var1);

        int _var2 = 20;
        int $var3 = 30;
        // int #var4 = 40; > 특수 문자는 _, $만 시작

        int var5 = 1000000000;
        // 4byte int 범위 초과 (-2,147,483,648 ~ 2,147,483,647)
        long var6 = 10000000000L;
        // long : 아주 큰 정수, 변수 선언 후 L 포함, 8byte 범위 (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
        
        double doubleVar = 3.1415926535235;
        // 실수, 범위 8byte
        float floatVar = 3.1415926535235F;
        // 실수, 변수 선언 후 F 포함
            System.out.println(floatVar);
        
        byte byteVar = 127;
            System.out.println(byteVar); // 정수 1byte (-128 ~ 127)

        short shortVar = 32767; // 2byte (-32768 ~ 32767)
            System.out.println(shortVar);

        //문자형
        char charVar = 'A';
            System.out.println(charVar);

        char koreanChar = '가';
            System.out.println(koreanChar);
    
        char unicodeChar1 = '\u0041';
            System.out.println(unicodeChar1);
        // 유니코드로 A 표현, 유니코드 문자표 참고

        char unicodeChar2 = '\u0061';
            System.out.println(unicodeChar2);

        //논리형
        boolean isTrue = true;
        boolean isFalse = false;
            System.out.println(isTrue);
            System.out.println(isFalse);

        boolean result = (5 > 3);
            System.out.println(result); //true
    }
}
