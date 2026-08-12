package a26_0812.file;

import java.io.File;

public class File4 {
    public static void main(String[] args) {
        File file = new File("C:/abc/test.txt");

        if(file.delete()) { // 파일 삭제
            System.out.println("삭제 완료");
        }
        
        else {
            System.out.println("삭제 실패");
        }
    }
}
