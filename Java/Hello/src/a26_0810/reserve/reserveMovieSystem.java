package a26_0810.reserve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reserveMovieSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> runningMovie = new HashMap<>();
        runningMovie.put("어벤져스", 15000);
        runningMovie.put("기생충", 12000);
        runningMovie.put("범죄도시", 13000);
        runningMovie.put("인터스텔라", 14000);
        runningMovie.put("타이타닉", 12000);
        runningMovie.put("겨울왕국", 11000);
        runningMovie.put("오펜하이머", 15000);
        
        HashMap<String, Integer> bookedMovie = new HashMap<>();
        
        while(true) {
            // 상영 목록
            System.out.println("\n ===== 현재 상영작 =====");
            for(Map.Entry<String, Integer> entry : runningMovie.entrySet()) {
                System.out.println(entry.getKey() + " ￦" +entry.getValue());
            }

            // 영화 선택 및 수량 입력
            System.out.print("\n예매하실 영화 이름 [종료 :'종료'] > ");
            String bookingTitle = sc.nextLine();

            if(bookingTitle.equals("종료")) {
                break;
            }
            if(!runningMovie.containsKey(bookingTitle)) {
                System.out.println("상영 정보가 존재하지 않습니다.");
                continue;
            }

            System.out.print("\n예매하실 매수 [종료 :'종료'] > ");
            int bookingQuantity = Integer.parseInt(sc.nextLine());
            if(bookingQuantity <= 0) {
                System.out.println("수량은 1개 이상이어 합니다.");
                continue;
            }

            // 예매 목록에 추가 및 동일 예매 수량 추가
            if(bookedMovie.containsKey(bookingTitle)) {
                bookedMovie.put(bookingTitle, bookedMovie.get(bookingTitle) + bookingQuantity);
            }
            else {
                bookedMovie.put(bookingTitle, bookingQuantity);
            }

            int price = runningMovie.get(bookingTitle);
            System.out.println(bookingTitle + " | [" + bookingQuantity + "]매가 예매되었습니다.");
            System.out.println("금액 | " + (price * bookingQuantity) + "원");
        }
        // 총 금액 및 주문 내역
        int totalAmount = 0;
        int totalQuantity = 0;

        for(Map.Entry<String, Integer> entry : bookedMovie.entrySet()) {
            String bookingTitle = entry.getKey();
            int quantity = entry.getValue();
            int price = runningMovie.get(bookingTitle);
            int subTotal = price * quantity;

            System.out.println(bookingTitle + " | " + quantity + "매 > " + subTotal);
            totalAmount =+ subTotal;
            totalQuantity =+ quantity;
        } 
        System.out.println("최종 결제 금액 | " + totalAmount + "원");
        
        if(totalQuantity > 0) {
            double averageAmount = (double) totalAmount / totalQuantity;
            System.out.printf("평균 금액 | %.2f원\n", averageAmount);
        }

        sc.close();
    }
}
