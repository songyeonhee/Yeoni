package a26_0821.car;

public class Car {
  private String carNumber;
  private String carType;
  private String color;
  private int year;
  private int price;

  public Car(String carNumber, String carType, String color, int year, int price) {
    this.carNumber = carNumber;
    this.carType = carType;
    this.color = color;
    this.year = year;
    this.price = price;
  }

  public String getCarNumber() {
    return carNumber;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "차량 번호 > " + carNumber + " | 차종 > " + carType + " | 색상 > " + color + " | 연식 > " + year + " | 가격 > "
        + price + "만원";
  }

}
