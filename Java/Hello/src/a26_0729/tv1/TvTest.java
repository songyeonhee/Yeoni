package a26_0729.tv1;

public class TvTest {
    public static void main(String[] args) {
    Tv1 tv1 = new Tv1();
    Tv1 tv2 = new Tv1();

    tv1.channel = 7;
    tv1.volume = 15;

    tv2.channel = 20;
    tv2.volume = 12;

    System.out.println();

    System.out.println("TV 1");
    System.out.println("회사 : " + Tv1.made);
    System.out.println("크기 : " + Tv1.size);
    System.out.println("채널 : " + tv1.channel + "번");
    System.out.println("볼륨 : " + tv1.volume);

    System.out.println();

    System.out.println("==============================");

    System.out.println();
    
    System.out.println("TV 2");
    System.out.println("회사 : " + Tv1.made);
    System.out.println("크기 : " + Tv1.size);
    System.out.println("채널 : " + tv2.channel + "번");
    System.out.println("볼륨 : " + tv2.volume);
    }
}
