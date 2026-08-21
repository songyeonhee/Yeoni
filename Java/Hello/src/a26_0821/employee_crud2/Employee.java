package a26_0821.employee_crud2;

public class Employee {
  private String id; // E001
  private String name;
  private String dept; // 부서
  private int salary; // 연봉

  public Employee(String id, String name, String dept, int salary) {
    this.id = id;
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }

  public String getId() {
    return id;
  }

  // public void setId(String id) {
  // this.id = id;
  // } id는 수정 불가 조건

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "사번 > " + id + " | 이름 > " + name + " | 부서 > " + dept + " | 연봉 > " + salary + "만원";
  }

}
