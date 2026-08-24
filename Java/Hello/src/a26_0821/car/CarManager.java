package a26_0821.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarManager {
    private ArrayList<Car> cars = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public CarManager() {
        cars.add(new Car("12가3456", "소나타", "흰색", 2022, 2500));
        cars.add(new Car("34나7890", "아반떼", "검정", 2021, 1800));
        cars.add(new Car("56다1234", "그랜저", "은색", 2023, 4200));
        cars.add(new Car("78라5678", "쏘렌토", "파랑", 2020, 3100));
        cars.add(new Car("90마9012", "소나타", "회색", 2024, 2800));
    }

    public void run() {
        while (true) {
            printMenu(); // 전체 메뉴 출력

            String com = sc.nextLine();

            switch (com) {
                case "1":
                    createCar(); // 차량 등록
                    break;

                case "2":
                    readAllCar(); // 전체 조회
                    break;

                case "3":
                    updateCar(); // 차량 수정
                    break;

                case "4": // 차량 삭제
                    deleteCar();
                    break;

                case "5":
                    searchByCarNumber(); // 차량 번호로 검색
                    break;

                case "6":
                    searchByCarType(); // 차종으로 검색
                    break;

                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘 못된 입력입니다.");
                    break;
            }
        }
    }

    // case "6": 차종으로 검색
    private void searchByCarType() {
        System.out.print("검색할 차종 입력 > ");
        String inputCarType = sc.nextLine();

        ArrayList<Car> foundCars = new ArrayList<>();
        for (Car c : cars) {
            if (c.getCarType().contains(inputCarType)) {
                foundCars.add(c);
            }
        }

        if (foundCars.isEmpty()) {
            System.out.println("해당 차종에 등록된 차량이 존재하지 않습니다.");
            return;
        }
        for (Car c : foundCars) {
            System.out.println(c);
        }
    }

    // case "4": 차량 삭제
    private void deleteCar() {
        System.out.print("삭제할 차량 번호 입력 > ");
        String inputCarNumber = sc.nextLine();
        Car car = findByCarNumber(inputCarNumber);

        if (car == null) {
            System.out.println("해당 차량 번호로 등록된 차량이 존재하지 않습니다.");
            return;
        }

        cars.remove(car);
        System.out.println("성공적으로 삭제되었습니다.");
    }

    // case "3": 차량 수정
    private void updateCar() {
        System.out.print("수정할 차량 번호 입력 > ");
        String inputCarNumber = sc.nextLine();
        Car car = findByCarNumber(inputCarNumber);

        if (car == null) {
            System.out.println("해당 차량 번호로 등록된 차량이 존재하지 않습니다.");
            return;
        }

        System.out.print("차종 > ");
        car.setCarType(sc.nextLine());

        System.out.print("색상 > ");
        car.setColor(sc.nextLine());

        System.out.print("연식 > ");
        car.setYear(Integer.parseInt(sc.nextLine()));

        System.out.print("가격(만원) > ");
        car.setPrice(Integer.parseInt(sc.nextLine()));

        System.out.println("성공적으로 수정되었습니다.");

    }

    // case "5": 차량 번호로 검색
    private void searchByCarNumber() {
        System.out.print("검색할 차량 번호 입력 > ");
        String inputCarNumber = sc.nextLine();
        Car car = findByCarNumber(inputCarNumber);

        if (car == null) {
            System.out.println("해당 차량 번호로 등록된 차량이 존재하지 않습니다.");
            return;
        }

        System.out.println(car);
    }

    // case "1": 차량 등록
    private void createCar() {
        System.out.print("등록할 차량 번호 입력 > ");
        String inputCarNumber = sc.nextLine();
        Car car = findByCarNumber(inputCarNumber);

        if (car != null) {
            System.out.println("이미 등록된 차량입니다.");
            return;
        }

        System.out.print("차종 > ");
        String inputType = sc.nextLine();

        System.out.print("색상 > ");
        String inputColor = sc.nextLine();

        System.out.print("연식 > ");
        int inputYear = Integer.parseInt(sc.nextLine());

        System.out.print("가격(만원) > ");
        int inputPrice = Integer.parseInt(sc.nextLine());

        cars.add(new Car(inputCarNumber, inputType, inputColor, inputYear, inputPrice));
        System.out.println("[" + inputCarNumber + "] 성공적으로 등록되었습니다.");

    }

    private Car findByCarNumber(String CarNumber) {
        for (Car c : cars) {
            if (CarNumber.equals(c.getCarNumber())) {
                return c;
            }
        }
        return null;
    }

    // case "2": 전체 조회
    private void readAllCar() {
        System.out.println("========== 전체 차량 목록 ===========");
        if (cars.isEmpty()) {
            System.out.println("등록된 차량이 존재하지 않습니다.");
            return;
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("[%d] %s\n", i + 1, cars.get(i));
        }
    }

    // 전체 메뉴 출력
    private void printMenu() {
        System.out.println("========== 차량 관리 시스템 ==========");
        System.out.println("1. 차량 등록 (C)");
        System.out.println("2. 전체 조회 (R)");
        System.out.println("3. 차량 수정 (U)");
        System.out.println("4. 차량 삭제 (D)");
        System.out.println("5. 차량 번호로 검색");
        System.out.println("6. 차종으로 검색");
        System.out.println("0. 프로그램 종료");
        System.out.print("선택 > ");

    }

}