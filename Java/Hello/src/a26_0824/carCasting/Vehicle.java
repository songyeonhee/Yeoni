package a26_0824.carCasting;

public abstract class Vehicle {
  protected String name;
  protected int id;
  protected double baseFee;

  public Vehicle(String name, int id, double baseFee) {
    this.name = name;
    this.id = id;
    this.baseFee = baseFee;
  }

  public String getName() {
    return name;
  }

  void printInfo() {
    System.out.println("ID > " + id + " | 차종 > " + name + " | 기본 요금 > " + baseFee + " | 실 요금 > " + calculateFee());
  }

  abstract double calculateFee();
}
