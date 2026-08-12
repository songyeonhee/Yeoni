package a26_0812.travel;

import java.io.File;
import java.io.FileWriter;

public class TravelSave {
    public static void main(String[] args) {
        Travel1[] tvArr = {
            new Travel1("제주", 3, 400000),
            new Travel1("부산", 2, 250000),
            new Travel1("도쿄", 5, 1200000)
        };
        
        File fd = new File("C:/travelEx");

        if (!fd.exists()) {
            fd.mkdir();
        }

        File file = new File("C:/travelEx/travel.txt");

        try {
            FileWriter fw = new FileWriter(file);
            for(Travel1 tv : tvArr) {
                fw.write("===== 여행 정보 =====\n");
                fw.write("도시 : " + tv.getCity() + "\n");
                fw.write("일수 : " + tv.getDays() + "\n");
                fw.write("비용 : " + tv.getCost() + "\n");
            }
            fw.close();

            System.out.println("여행 정보 저장 완료");

        } catch (Exception e) {
            System.out.println("여행 정보 저장 실패");
            System.out.println(e.getMessage());
        }
    }
}
