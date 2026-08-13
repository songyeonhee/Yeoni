package a26_0813.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class File5 {
    public static void main(String[] args) throws IOException { // 예외를 JVM 넘겨줌
        FileOutputStream output = new FileOutputStream("C:/Users/TJ/out.txt");
        // FileOutputStream output : 파일 출력 객체를 만든다
        // new FileOutputStream("C:/Users/TJ/out.txt"); : 생성자 호출 (파일을 연다 > 파일 없으면 생성)
        output.close();
    }
}
