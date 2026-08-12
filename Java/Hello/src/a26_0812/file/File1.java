package a26_0812.file;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file = new File("C:/abc/test.txt");
        System.out.println(file);
        // 아직 파일을 읽은 것이 아닌 단지 파일을 객체로 만든 것 뿐이다.
    }
}
