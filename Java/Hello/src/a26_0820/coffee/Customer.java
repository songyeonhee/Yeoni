package a26_0820.coffee;

import java.util.Map;

public class Customer {
  private int orderNum; // 고객의 주문 번호
  private int money; // 고객이 가지고 있는 돈을 저장
  private Map<String, Integer> coffeeOrder; // 커피 주문

  public Customer(int orderNum) {
    this.orderNum = orderNum;
    this.money = 20000; // 초기값 20000원 직접 입력
  }

  public int getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(int orderNum) {
    this.orderNum = orderNum;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public Map<String, Integer> getCoffeeOrder() {
    return coffeeOrder;
  }

  public void setCoffeeOrder(Map<String, Integer> coffeeOrder) {
    this.coffeeOrder = coffeeOrder;
  }

  public String getOrderName() {
    return "고객" + orderNum;
  }
}
