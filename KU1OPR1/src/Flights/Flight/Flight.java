package Flights.Flight;

import java.time.Duration;
import java.time.LocalDateTime;

public class Flight {
    private String flightName;
    private String route;
    private  LocalDateTime leavingDate;
    private  LocalDateTime arrivingDate;


    private String aerolineName;
    private double price;
    private String aeroClass;

    public Flight(String flightName, String route, LocalDateTime leavingDate, LocalDateTime arrivingDate, String aerolineName, double price, String aeroClass) {
        this.flightName = flightName;
        this.route = route;
        this.leavingDate = leavingDate;
        this.arrivingDate = arrivingDate;
        this.aerolineName = aerolineName;
        this.price = price;
        this.aeroClass = aeroClass;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getRoute() {
        return route;
    }

    public LocalDateTime getLeavingDate() {
        return leavingDate;
    }

    public LocalDateTime getArrivingDate() {
        return arrivingDate;
    }

    public String getAerolineName() {
        return aerolineName;
    }

    public double getPrice() {
        return price;
    }

    public String getAeroClass() {
        return aeroClass;
    }





}
