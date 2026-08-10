package a26_0810.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // 커피 메뉴 추가
        HashMap<String, Integer> menu = new HashMap<>();

        menu.put("아메리카노", 4000);
        menu.put("카페라떼", 4500);
        menu.put("카푸치노", 5000);
        // menu.put("에스프레소", 3500);
        // menu.put("바닐라라떼", 5500);
        // menu.put("카라멜 마끼아또", 6000);

        System.out.println("===== 초기 커피 메뉴 =====");
        for(Map.Entry<String, Integer> entry : menu.entrySet()) {
            // System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
            String coffee = entry.getKey();
            Integer price = entry.getValue();
            System.out.println(coffee + " : " + price + "원");
        }
        
        // 새 메뉴 추가
        System.out.print("\n추가할 메뉴 이름 : ");
        String newMenu = sc.nextLine();
        System.out.print("\n추가할 메뉴 가격 : ");
        int newPrice = Integer.parseInt(sc.nextLine());

        menu.put(newMenu, newPrice);
        System.out.println(newMenu + " > 정상적으로 추가되었습니다.");

        System.out.println("===== 추가 후 메뉴 =====");
        for(Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
        }

        // 기존 가격 수정
        System.out.print("\n수정할 메뉴 이름 : ");
        String updateMenu = sc.nextLine();
        if(menu.containsKey(updateMenu)) {
            System.out.print("새로운 가격 : ");
            int updatePrice = Integer.parseInt(sc.nextLine());
            menu.put(updateMenu, updatePrice);
            System.out.println(updateMenu + "의 가격이 " + updatePrice + "원으로 수정되었습니다.");
        }else {
            System.out.println("일치하는 메뉴가 없습니다.");
        }
        System.out.println("===== 최종 메뉴 =====");
        for(Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
        }


        sc.close();
    }
}
