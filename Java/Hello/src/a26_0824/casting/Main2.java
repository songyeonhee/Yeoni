package a26_0824.casting;

public class Main2 {
  public static void main(String[] args) {
    Vehicle v = new Car();
    // 업캐스팅 : 자식의 객체를 부모 타입 변수에 담음
    // 겉 모습은 Vehicle, 실제로는 안에 Car 객체들이 있음

    v.start();
    // 다형성
    // Vehicle의 start()를 호출하는 것 같지만 실제 객체는 Car이므로
    // 오버라이딩 된 Car - start()가 출력

    v.stop();
    // 부모에 있는 메서드도 호출 가능
    // Car에는 stop()이 없으므로 부모의 stop() 출력

    // v.drive();
    // 부모 타입의 눈에서는 Car의 메서드인 drive()는 보이지 않음

    Car c = (Car) v;
    // 다운캐스팅 : 부모 타입을 다시 원래의 자식 타입으로 강제 형변환
    // v 안에 들어있던 진짜 객체가 Car였기 때문에 안전하게 변환 가능

    c.drive();

    // 안전한 다운캐스팅
    if (v instanceof Car) { // 정말 Car인지 확인하고
      ((Car) v).drive(); // 맞으면 다운캐스팅

      if (v instanceof Car) { // 타입이 Car인가 ?
        Car c1 = (Car) v;
        c1.drive();
      }
    }
  }
}

class Vehicle {
  void start() {
    System.out.println("차량 출발");
  }

  void stop() {
    System.out.println("차량 정지");
  }
}

class Car extends Vehicle {
  void start() {
    System.out.println("자동차 시동");
  }

  void drive() {
    System.out.println("자동차 주행");
  }
}
