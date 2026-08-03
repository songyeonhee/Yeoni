package a26_0803.book;

public class PrintBook extends Book{
    private int pageCount; // 추가 필드 : 페이지 수
    private double weight; // 추가 필드 : 무게


    public PrintBook(String title, String author, String iSBN, int pageCount, double weight) {
        super(title, author, iSBN); // 상속받음
        this.pageCount = pageCount;
        this.weight = weight;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count : " + pageCount);
        System.out.println("Weight : " + weight);
    }

    
}
