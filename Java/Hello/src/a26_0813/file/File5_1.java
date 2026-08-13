package a26_0813.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class File5_1 {
    public static void main(String[] args) throws IOException { // 예외를 JVM 넘겨줌
        FileOutputStream output = new FileOutputStream("C:/Users/TJ/out.txt");
        for(int i=1; i<11; i++) {
            String data = i + "번째 줄 입력\r\n";
            // window 줄 바꿈 단어 \r\n, 리눅스에서는 \n
            output.write(data.getBytes());
        }
        output.close();
    }
}
