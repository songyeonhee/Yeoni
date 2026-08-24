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
        for (int i = 0; i < seats.size() - 3; i += 4) {
            System.out.printf("|\t[%2s]\t\t[%2s][%2s]\t\t[%2s]\t|\n", seats.get(i), seats.get(i + 1), seats.get(i + 2),
                    seats.get(i + 3));
        }
    }



    public String getDestination() {
        return destination;
    }



    public void setDestination(String destination) {
        this.destination = destination;
    }



    public String getDepartureTime() {
        return departureTime;
    }



    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }



    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }



    public boolean isInternational() {
        return isInternational;
    }



    public void setInternational(boolean isInternational) {
        this.isInternational = isInternational;
    }



    public ArrayList<String> getSeats() {
        return seats;
    }



    public void setSeats(ArrayList<String> seats) {
        this.seats = seats;
    }
}
