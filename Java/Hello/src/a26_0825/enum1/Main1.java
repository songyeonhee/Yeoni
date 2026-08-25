package a26_0825.enum1;

public class Main1 {
  public static void main(String[] args) {
    Day today = Day.WEDNEDSDAY;
    if (today == Day.WEDNEDSDAY) {
      System.out.println("수요일은 스터디가 있는 날입니다.");
    }

    // switch문과 함께 사용할 때 매우 강력
    switch (today) {
      case MONDAY:
        System.out.println("월요병 극복");
        break;

      case WEDNEDSDAY:
        System.out.println("주말까지 이틀 남음");
        break;

      default:
        System.out.println("평일 또는 주말");
        break;
    }
  }
}
