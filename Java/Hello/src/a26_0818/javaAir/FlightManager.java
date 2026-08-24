package a26_0818.javaAir;

import java.util.ArrayList;

public class FlightManager {
    private ArrayList<Flight> flights;

    public FlightManager() {
        this.flights = new ArrayList<>();
    }

    // ArrayList에 항공편 추가
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    // 항공편 조회
    public void readFlights() {
        for (Flight f : flights) {
            System.out.println(f);
        }
    }

}
