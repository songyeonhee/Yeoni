package a0730.product1;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("==== 상품 총 금액 계산 ====");

        Product1 p1 = new Product1("노트북",1000000, 2);
        Product1 p2 = new Product1("마우스",25000, 3);
        Product1 p3 = new Product1("키보드",50000, 1);
    
            p1.setDiscountRate(0.1); // 10%
            p2.setDiscountRate(0.15); // 15%

        public void
        // 상품1 정보 출력
        p1.printProductinfo();
        System.out.println();

        // 상품2 정보 출력
        p2.printProductinfo();
        System.out.println();

        // 상품3 정보 출력
        p3.printProductinfo();
        System.out.println();

        System.out.println(PrintReceipt());
    }

    
}
