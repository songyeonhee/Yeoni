package a26_0812.file;

import java.io.File;

public class File3 {
    public static void main(String[] args) {
        File folder = new File("C:/abcd");

        if(!folder.exists()) { // 폴더가 존재하지 않으면
            folder.mkdir(); // make directiory : 폴더가 없으면 폴더를 생성
            System.out.println("폴더 생성 완료");
        }
        
        else {
            System.out.println("이미 존재합니다");
        }
    }
}
