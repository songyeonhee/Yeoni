package a26_0818.javaAir;

import java.util.ArrayList;

public class Flight {
    private String destination;
    private String departureTime;
    private int price;
    private boolean isInternational;
    private ArrayList<String> seats;

    public Flight(String destination, String departureTime, int price, boolean isInternational) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.price = price;
        this.isInternational = isInternational;
        this.seats = new ArrayList<String>();
        addSeats();
    }

    private void addSeats() {
        for (int i = 0; i < 20; i++) {
            seats.add(i + 1 + "");
        }
    }

    public void displaySeats() {
        for (int i = 0; i < seats.size(); i++) {
            System.out.printf("[%2s]", seats.get(i));
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
