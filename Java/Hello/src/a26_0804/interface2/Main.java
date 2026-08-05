package a26_0804.interface2;

public class Main {
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        RemoteControl air = new AirConditioner();

        tv.powerOn();
        air.powerOn();
    }
}
