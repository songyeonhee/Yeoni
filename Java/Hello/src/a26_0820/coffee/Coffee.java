package a26_0820.coffee;

import java.util.Map.Entry;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Coffee {
  private static Coffee instance; // 싱글톤

  private Coffee() {
  }; // 기본 생성자

  public static Coffee getInstance() {
    if (instance == null) { // Coffee 객체가 없으면 생성
      instance = new Coffee();
    }
    return instance;
  }

  ArrayList<String> coffeeList; // 커피 종류
  ArrayList<Integer> coffeePrice; // 커피 가격
  Map<String, Integer> menu;

  public void getMenu() {
    menu = new LinkedHashMap<String, Integer>(); // 순서가 있는 LinkedHashMap
    coffeeList = new ArrayList<>();
    coffeePrice = new ArrayList<>();

    coffeeList.add("카푸치노");
    coffeeList.add("아이스 아메리카노");
    coffeeList.add("카라멜 마끼아또");
    coffeeList.add("카페라떼");
    coffeeList.add("카페모카");

    coffeePrice.add(2000);
    coffeePrice.add(4500);
    coffeePrice.add(2500);
    coffeePrice.add(4000);
    coffeePrice.add(3000);
    coffeePrice.add(3500);

    // menu("아메리카노", 2000)
    for (int i = 0; i < coffeeList.size(); i++) {
      menu.put(coffeeList.get(i), coffeePrice.get(i));
    }
  }

  public void printMenu() {
    for (String coffee : menu.keySet()) {
      System.out.println(coffee + " : " + menu.get(coffee) + "원");
    }
    StringBuffer st = new StringBuffer();
    st.append("\n\n")
        .append("+---------------------------------------------------+\n")
        .append("+------------------------메뉴판----------------------+\n")
        .append("|            Menu                   price           |\n");
    System.out.println(st.toString());

    DecimalFormat f = new DecimalFormat("#,###");
    int s = 1;
    for (Entry<String, Integer> get : menu.entrySet()) {
      // System.out.println(get.getKey() + " : " + get.getValue() + "원");
      System.out.printf(": [%d] %-20s\t %s      :\n", s, get.getKey(), f.format(get.getValue()));
      s++;
    }
    System.out.println("+-----------------------------------------------------------+");
  }

}
