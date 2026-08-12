package a26_0812.exception;

import java.io.FileWriter;

public class FileWriter1 {
    public static void main(String[] args) {

        // C:\abc 폴더가 존재해야 합니다. 폴더가 없을 경우 IOException 에러 발생
        try {
            FileWriter fw = new FileWriter("C:/abc/test.txt");
            fw.write("hi.\n");
            fw.write("Java Input Output");

            fw.close();

            System.out.println("파일 저장 완료");
        } catch (Exception e) {
            System.out.println("파일 저장 실패");
            System.out.println(e.getMessage()); // C:\abc\test.txt (지정된 경로를 찾을 수 없습니다)

            // C:/abc 폴더 생성 후 > 파일 저장 완료
        }
    }
}
