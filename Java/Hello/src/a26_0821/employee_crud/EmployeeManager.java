package a26_0821.employee_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
  private ArrayList<Employee> employees = new ArrayList<>();
  private Scanner sc = new Scanner(System.in);

  public EmployeeManager() {
    employees.add(new Employee("E001", "홍길동", "개발팀", 3500));
    employees.add(new Employee("E002", "김영희", "인사팀", 3200));
    employees.add(new Employee("E003", "이철수", "영업팀", 3000));
    employees.add(new Employee("E004", "박민수", "개발팀", 3800));
    employees.add(new Employee("E005", "최지우", "기획팀", 3400));
  }

  public void run() {
    while (true) {
      // 선택 메뉴 출력
      System.out.println("========== 직원 관리 시스템 ==========");
      System.out.println("1. 직원 등록 (C)");
      System.out.println("2. 전체 조회 (R)");
      System.out.println("3. 직원 수정 (U)");
      System.out.println("4. 직원 삭제 (D)");
      System.out.println("5. 사번으로 검색");
      System.out.println("6. 부서로 검색");
      System.out.println("7. 평균 연봉");
      System.out.println("8. 부서별 평균 연봉");
      System.out.println("0. 종료");
      System.out.print("선택>");

      String com = sc.nextLine();

      switch (com) {
        case "1":
          // 직원 등록
          addEmployee();
          // 사번 입력, 사번 중복이 없으면 이름/부서/연봉을 입력받은 후 ArrayListList에 추가
          break;

        case "2":
          // 전체 조회
          readEmployee();
          break;

        case "3":
          // 직원 수정
          updateEmployee();
          break;

        case "4":
          // 직원 삭제
          deleteEmployee();
          break;

        case "5":
          // 사번으로 검색
          searchEmployee();
          break;

        case "6":
          // 부서로 검색
          searchByDept();
          break;

        case "7":
          // 평균 연봉
          averageSalary();
          break;

        case "8":
          // 평균 연봉
          DaptAverageSalary();
          break;

        case "0":
          System.out.println("프로그램을 종료합니다.");
          return; // 완전히 빠져나감

        default:
          System.out.println("잘 못된 입력입니다.");
          ;
      }
    }
  }

  private void DaptAverageSalary() {
    System.out.print("부서 > ");
    String dept = sc.nextLine();

    // 받아올 리스트 생성
    ArrayList<Employee> result = new ArrayList<>();
    for (Employee e : employees) {
      if (e.getDept().equals(dept)) {
        result.add(e); // 부서 입력 후 생성된 리스트에 추가
      }
    }
    if (result.isEmpty()) {
      System.out.println("해당 부서에 소속된 직원이 존재하지 않습니다.");
      return;
    }

    int sum = 0;
    for (Employee e : result) {
      sum += e.getSalary();
    }

    double avg = (double) sum / result.size();
    System.out.println(dept + " 직원 | " + result.size() + "명");
    System.out.println("연봉 합계 | " + sum + "만원");
    System.out.println("평균 연봉 | " + avg + "만원");
  }

  private void averageSalary() {
    if (employees.isEmpty()) {
      System.out.println("등록된 직원이 존재하지 않습니다");
      return;
    }

    int sumSalary = 0; // 연봉 합계
    for (Employee e : employees) {
      sumSalary += e.getSalary();
    }
    double aveSalary = (double) sumSalary / employees.size();
    System.out.println("전체 직원 수 | " + employees.size() + "명");
    System.out.println("전체 연봉 합계 | " + sumSalary + "만원");
    System.out.printf("평균 연봉 | %.1f만원\n", aveSalary);
  }

  private void searchByDept() {
    // 사번은 중복 불가한 유일 키, 한 개의 객체만 받아오면 되나
    // 부서로 검색은 여러 객체가 출력될 수 있기 때문에 리스트로 받아야함

    System.out.print("부서 > ");
    String dept = sc.nextLine();

    // 받아올 리스트 생성
    ArrayList<Employee> result = new ArrayList<>();
    for (Employee e : employees) {
      if (e.getDept().equals(dept)) {
        result.add(e); // 부서 입력 후 생성된 리스트에 추가
      }
    }
    if (result.isEmpty()) {
      System.out.println("해당 부서에 소속된 직원이 존재하지 않습니다.");
      return;
    }
    System.out.println(dept + " | 직원 " + result.size() + "명");
    for (Employee e : result) {
      System.out.println(e);
    }
  }

  private void addEmployee() {
    // 사번 입력, 사번 중복이 없으면 이름/부서/연봉을 입력받은 후 ArrayListList에 추가
    System.out.print("사번 > ");
    String id = sc.nextLine();
    Employee e = findById(id);

    if (findById(id) != null) {
      System.out.println("이미 존재하는 사번입니다.");
      return;
    }

    System.out.print("성명 > ");
    String name = sc.nextLine();
    if (!name.isEmpty()) {
      e.setName(name);
    }

    System.out.print("부서명 > ");
    String dept = sc.nextLine();
    if (!dept.isEmpty()) {
      e.setDept(dept);
    }

    System.out.print("연봉(만원) > ");
    String salaryStr = sc.nextLine();
    if (!salaryStr.isEmpty()) {
      e.setSalary(Integer.parseInt(salaryStr));
    }

    employees.add(new Employee(id, name, dept, Integer.parseInt(salaryStr)));

    System.out.println("성공적으로 등록되었습니다.");
  }

  private Employee findById(String id) {
    for (Employee e : employees) {
      if (id.equals(e.getId())) {
        return e;
      }
    }
    return null;
  }

  private void readEmployee() {
    if (employees.isEmpty()) {
      System.out.println("등록된 직원이 존재하지 않습니다.");
      return;
    }
    for (int i = 0; i < employees.size(); i++) {
      System.out.println("[ " + (i + 1) + " ] " + employees.get(i));
    }
  }

  private void updateEmployee() {
    System.out.print("수정할 사원의 사번 입력 > ");
    String id = sc.nextLine();
    Employee e = findById(id);

    if (e == null) {
      System.out.println("등록된 직원이 존재하지 않습니다.");
      return;
    }

    System.out.print("성명 > ");
    e.setName(sc.nextLine());

    System.out.print("부서명 > ");
    e.setDept(sc.nextLine());

    System.out.print("연봉(만원) > ");
    e.setSalary(Integer.parseInt(sc.nextLine()));

    System.out.println("성공적으로 수정되었습니다.");
  }

  private void deleteEmployee() {
    System.out.println("삭제할 사원의 사번 입력 > ");
    String id = sc.nextLine();
    Employee e = findById(id);

    if (e == null) {
      System.out.println("등록된 직원이 존재하지 않습니다.");
      return;
    }
    employees.remove(e);

    System.out.println("성공적으로 삭제되었습니다.");
  }

  private void searchEmployee() {
    System.out.println("검색할 사원의 사번 입력 > ");
    String id = sc.nextLine();
    Employee e = findById(id);

    if (e == null) {
      System.out.println("등록된 직원이 존재하지 않습니다.");
      return;
    }
    System.out.println(e);
  }

}