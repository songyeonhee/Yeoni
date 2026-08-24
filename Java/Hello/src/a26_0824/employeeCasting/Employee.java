package a26_0824.employeeCasting;

// 직원 관리 시스템

// 추상 클래스 : Employee라는 개념은 존재하지만 그냥 직원은 없음 (정규직, 계약직, 파트타임)
// 추상 클래스 특징 : 직접 객체 생성 불가, Employee e = new Employee x
// 반드시 자식 클래스에 상속해주기 위해서만 존재하는 설계도 및 규격서

public abstract class Employee {
  protected String name;
  protected int id;
  protected double baseSalary;

  public Employee(String name, int id, double baseSalary) {
    this.name = name;
    this.id = id;
    this.baseSalary = baseSalary;
  }

  public String getName() {
    return name;
  }

  void printlnfo() {
    System.out.println("ID > " + id + " | name > " + name + " | 기본급 > " + baseSalary + " | 실급여 > " + calculateSalary());
  }

  // 추상 메서드
  // protected : 같은 패키지 내부, 클래스를 상속받은 자식 클래스
  abstract double calculateSalary();
  // 직원 타입마다 달라 완전히 정의할 수 없음
  // 정규직 (기본급 + 보너스) | 계약직 (기본급) | 파트타임 (근무시간 * 시급)

}
