package a26_0824.carCasting;

public class Main1 {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[5];

    vehicles[0] = new Sedan("아반떼", 1, 50000, 20000);
    vehicles[1] = new Truck("포터", 2, 0, 8, 15000);
    vehicles[2] = new ElectricCar("아이오닉", 3, 80000, 10000, 5);
    vehicles[3] = new Sedan("소나타", 4, 60000, 25000);
    vehicles[4] = new Truck("마이티", 5, 0, 6, 18000);

    // 모든 차량 호출
    System.out.println("\n===== 전체 차량 정보 =====");
    for (Vehicle v : vehicles) {
      v.printInfo();
    }
    System.out.println();

    // 전체 요금 합계 출력
    System.out.println("===== 전체 요금 합계 =====");
    double totalFee = 0;
    for (Vehicle v : vehicles) {
      totalFee += v.calculateFee();
    }
    System.out.println("전체 요금 합계 > " + String.format("%,.0f원", totalFee));
    System.out.println();

    // 다운 캐스팅으로 타입별 전용 메서드 호출
    System.out.println("===== 차량 타입별 처리 =====");
    for (Vehicle v : vehicles) {
      if (v instanceof Sedan) {
        Sedan sedan = (Sedan) v;
        sedan.driveSedan();
      } else if (v instanceof Truck) {
        Truck truck = (Truck) v;
        truck.haulCargo();
      } else if (v instanceof ElectricCar) {
        ElectricCar electricCar = (ElectricCar) v;
        electricCar.chargeBattery();
      }
    }
    System.out.println();

    // "아반떼" 검색 후 정보 출력, 존재하지 않을 경우 못 찾았다고 출력
    System.out.println("===== 특정 차량 검색 =====");
    String searchName = "아반떼";
    Vehicle foundVehicle = findVehicle(vehicles, searchName);
    if (foundVehicle != null) {
      System.out.println("  +---- 검색 결과 -----+");
      foundVehicle.printInfo();
    } else {
      System.out.println("해당하는 정보를 찾을 수 없습니다.");
    }

  }

  private static Vehicle findVehicle(Vehicle[] vehicles, String searchName) {
    for (Vehicle v : vehicles) {
      if (v.getName().equals(searchName)) {
        return v;
      }
    }
    return null;
  }
}
