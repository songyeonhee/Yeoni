package a26_0812.exception;

import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:/abc/text.txt");
            int data; // 읽는 문자 하나를 저장하는 변수
            // int로 선언한 이유는 문자의 아스키(유니) 코드 값(int)을 반환 (ex. A > 65)
            while ((data = fr.read())!= -1) { // 숫자가 있을 때 까지 읽는다 (-1이면 끝)
                System.out.println((char)data); // 유니코드 값을 문자로 반환
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
            System.out.println(e.getMessage());
        }
    }
}


// FileReader fr = new FileReader(...)   파일을 연다.
// fr.read()   한 글자씩 읽는다.
// data != -1   파일 끝인지 확인한다. (-1이면 끝)
// (char)data   숫자를 문자로 변환하여 출력한다.
// fr.close()   파일을 닫는다.
// catch(IOException)   파일이 없거나 읽기 실패 시 예외를 처리한다.