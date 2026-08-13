package a26_0813.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class File6 {
    public static void main(String[] args)  {
        try {
            FileOutputStream output = new FileOutputStream("C:/Users/TJ/out.txt");
        output.close();
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류 발생");
        }

        // 입출력만큼은 반드시 예외 처리 
        
    }
}
