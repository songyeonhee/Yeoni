package a26_0824.carCasting;

public class ElectricCar extends Vehicle {
  private int batteryCare;
  private int seats;

  public ElectricCar(String name, int id, double baseFee, int batteryCare, int seats) {
    super(name, id, baseFee);
    this.batteryCare = batteryCare;
    this.seats = seats;
  }

  @Override
  double calculateFee() {
    return baseFee + batteryCare + seats;
  }

  void chargeBattery() {
    System.out.println("좌석 수 > " + seats + "개 | 배터리를 충전해주세요.");
  }

}
