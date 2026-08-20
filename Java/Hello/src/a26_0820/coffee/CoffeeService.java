package a26_0820.coffee;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeService {
  private boolean reOrder = false; // 재주문
  private int orderNum = 1; // 주문 번호 초기화
  Map<String, Integer> orderList;

  public CoffeeService() {
    orderList = new LinkedHashMap<>(); // 입력 순서 보장
  }

  Coffee coffee = Coffee.getInstance();
  Customer customer;

  Thread t = new Thread(); // 스레드
  // 사용자가 처리할 프로그램 지정
  // 여기에선 지연 클래스 사용

  Scanner sc = new Scanner(System.in);

  public void start() {
    System.out.println("\n+--------- 커피숍 ---------+");
    customer = new Customer(orderNum); // 주문 번호, 잔액(카드)
    coffee.getMenu(); // 커피 종류, 가격을 보여줌
    order(); // 주문 베서드
    totalOrder(customer);
    try {
      System.out.println("기다려 주시면 주문하신 음료가 나옵니다.");
      t.sleep(2000);
      // 2초 후에 다음문장이 실행
      end();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void order() {
    System.out.println("\n취소를 원하시면 0번을 눌러주세요.");
    end: while (true) {
      try {
        System.out.print("\n원하는 음료의 번호 선택");
        String choice = sc.nextLine();
        int chiceNum = Integer.parseInt(choice.substring(0, 1));
        // 하나의 문자만 추출해서 숫자로 변경

        if (chiceNum == 0) {
          System.out.println("주문 취소");
          System.exit(0); // 0을 주면 빠져나감
        }
        String coffeeName = coffee.coffeeList.get(chiceNum - 1); // 1번 입력, 0에 아메리카노 존재
        System.out.print("선택하신 음료는 " + coffeeName + "입니다. 수량을 입력하세요 > ");
        int orderCount = Integer.parseInt(sc.nextLine());

        // 재주문 if
        if (reOrder) {
          for (String coff : orderList.keySet()) { // 모든 커피 이름을 가져와서
            if (coff.equals(coffeeName)) { // 똑같은 커피를 주문하면
              int addCount = orderList.get(coff).intValue() + orderCount;
              // 주문 리스트의 수량을 불러와서 추가 수량을 더한다.
              orderList.replace(coffeeName, addCount);
            } else {
              orderList.put(coffeeName, orderCount);
              break;
            }
          }
        } else {
          orderList.put(coffeeName, orderCount); // 커피 이름, 수량을 주문 리스트에 담아 저장
        }
        customer.setCoffeeOrder(orderList);

        // 추가 주문
        addOrder();
        break end;

      } catch (Exception e) {
        System.out.println("잘못된 선택");
      }

    }
  }

  private void addOrder() {
    reOrder = false;
    System.out.println("\n 주문을 계속 하시겠습니까? > ");
    System.out.print("예 [Y]  |  아니오 [N]");
    String yesOrno = sc.nextLine();
    if (yesOrno.equals("예") || yesOrno.equalsIgnoreCase("y")) {
      coffee.getMenu();
      reOrder = true;
      order();

      totalOrder(customer);

    } else if (yesOrno.equals("아니오") || yesOrno.equalsIgnoreCase("n")) {
      return;
    }
  }

  private void totalOrder(Customer customer2) {
    int s = 1;
    int totalMoney = 0;
    int coffeePrice = 0;
    DecimalFormat f = new DecimalFormat("###,000원");
    String name = customer.getOrderName() + "번 ";
    StringBuffer message = new StringBuffer();
    message.append("\n\n ")
        .append("+----------------------------------------------------+\n ")
        .append("|                                                    | \n ")
        .append("|             " + name + "고객님 의 주문 내역 입니다         | " + "\n");
    for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
      String coffeeName = order.getKey(); // 커피 이름
      int orderCount = order.getValue(); // 몇 잔 주문했는지
      int coffeeUnitPrice = coffee.menu.get(coffeeName); // 커피 가격
      coffeePrice = coffeeUnitPrice * orderCount;
      totalMoney = totalMoney + coffeePrice;
      String pay = f.format(coffeePrice); // 가격 포맷팅
      message.append(String.format(" | [%d] %-20s : %2d잔  %7s |\n", s, coffeeName, orderCount, pay));
      s++; // 리스트 인덱스 증가
      message.append(" |                                                    |\n ")
          .append("+----------------------------------------------------+ \n")
          .append(" ============ 총 결제 금액은 " + f.format(totalMoney) + "입니다 ========== \n");
      System.out.println(message);
      payment(totalMoney);
    }

  }

  private void payment(int totalMoney) {
    System.out.println("결제 카드를 넣어주세요.");
    int payResult = customer.getMoney() - totalMoney;

    try {
      System.out.println("결제 중입니다 . . .");
      t.sleep(2000); // 2초간 기다림
      end();

    } catch (Exception e) {
      e.printStackTrace();
    }
    if (payResult < 0) {
      System.out.println("잔액이 부족합니다.");
    } else {
      customer.setMoney(payResult);
      System.out.println("결제가 완료되었습니다.");
      System.out.println("이용해주셔서 감사합니다..");
      orderNum++; // 고객 번호 증가
    }
  }

  private void end() {
    int s = 1;
    StringBuffer message = new StringBuffer();
    message.append("\n\n ")
        .append("+----------------------------------------------------+\n ")
        .append("|                                                    | \n ")
        .append("|           " + customer.getOrderName() + " 고객님 주문하신 음료 나왔습니다         | " + "\n");
    System.out.print(message);
    for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
      System.out.printf(" | [%d] %-20s : %2d잔  %7s |\n", s, order.getKey(), order.getValue(), "");
      s++;
    }
    System.out.println(" |                                                    |");
    System.out.println(" +----------------------------------------------------+");
  }

}
