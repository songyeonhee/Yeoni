package a26_0824.carCasting;

public class Truck extends Vehicle {
  private int workHours;
  private double hourlyRate;

  public Truck(String name, int id, double baseFee, int workHours, double hourlyRate) {
    super(name, id, baseFee);
    this.workHours = workHours;
    this.hourlyRate = hourlyRate;
  }

  @Override
  double calculateFee() {
    return baseFee + (workHours * hourlyRate);
  }

  void haulCargo() {
    System.out.println("총 운행시간 > " + workHours + "시간");
  }

}
