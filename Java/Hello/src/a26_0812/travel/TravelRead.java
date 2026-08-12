package a26_0812.travel;

import java.io.FileReader;
import java.io.IOException;

public class TravelRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:/travelEx/travel.txt");
            int ch;

            while ((ch=fr.read())!= -1) {
                System.out.print((char)ch);
                
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
            System.out.println(e.getMessage());
        }
    }
}
