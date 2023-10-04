package model;

import enums.EAirlineClass;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Connection {

    private String flightID;
    private String placeFrom;
    private String placeTo;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;
    private String airline;
    private Double price;
    private EAirlineClass airlineClass;
    private long flightDuration;


    public Connection(String flightID, String placeFrom, String placeTo, ZonedDateTime departureTime,
                      ZonedDateTime arrivalTime, String airline, Double price, EAirlineClass airlineClass) {
        setFlightID(flightID);
        setPlaceFrom(placeFrom);
        setPlaceTo(placeTo);
        setDepartureTime(departureTime);
        setArrivalTime(arrivalTime);
        setAirline(airline);
        setPrice(price);
        setAirlineClass(airlineClass);
        setFlightDuration(Math.abs(getArrivalTime().toEpochSecond() - getDepartureTime().toEpochSecond()) / 60);
    }

    public Connection(String fromText) {
        parseText(fromText);
    }

    private void parseText(String text) {

        String[] data = text.split(", ");
        String[] places = data[1].split(" - ");

        setFlightID(parseFlightID(data[0]));
        setPlaceFrom(places[0]);
        setPlaceTo(places[1]);
        setDepartureTime(parseDate(data[2]));
        setArrivalTime(parseDate(data[3]));
        setAirline(parseAirline(data[4]));
        setPrice(parsePrice(data[5]));
        setAirlineClass(parseAirlineClass(data[6]));
        setFlightDuration(Math.abs(getArrivalTime().toEpochSecond() - getDepartureTime().toEpochSecond()) / 60);
    }

    private String parseFlightID(String str) {
        String[] data = str.split(" ");
        return data[1];
    }

    private ZonedDateTime parseDate(String str) {

        String[] data = str.split(" ");
        String[] date = data[1].split("\\.");
        String[] time = data[3].split(":");

        return ZonedDateTime.of(
                Integer.parseInt(date[2]),
                Integer.parseInt(date[1]),
                Integer.parseInt(date[0]),
                Integer.parseInt(time[0]),
                Integer.parseInt(time[1]),
                0, 0,
                ZoneId.systemDefault());
    }

    private Double parsePrice(String str) {
        String[] data = str.split(" ");
        return Double.parseDouble(data[1]);
    }

    private String parseAirline(String str) {
        String[] data = str.split(" ");
        StringBuilder out = new StringBuilder();
        for(int i = 1; i < data.length; i++) {
            out.append(data[i]);
            if (i < data.length-1) out.append(" ");
        }
        return out.toString();
    }

    private EAirlineClass parseAirlineClass(String str) {
        String[] data = str.split(" ");
        return switch (data[1].charAt(0)) {
            case 'b' -> EAirlineClass.BUSINESS;
            case 'e' -> EAirlineClass.ECONOMIC;
            default -> null;
        };
    }

    @Override
    public String toString() {
        return flightID + ", " + placeFrom + ", " + placeTo + ", " + departureTime.toString()
                + ", " + arrivalTime.toString() + ", " + airline + ", " + price + ", " + airlineClass.toString()
                + ", " + flightDuration;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getPlaceTo() {
        return placeTo;
    }

    public void setPlaceTo(String placeTo) {
        this.placeTo = placeTo;
    }

    public String getPlaceFrom() {
        return placeFrom;
    }

    public void setPlaceFrom(String placeFrom) {
        this.placeFrom = placeFrom;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(ZonedDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(ZonedDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EAirlineClass getAirlineClass() {
        return airlineClass;
    }

    public void setAirlineClass(EAirlineClass airlineClass) {
        this.airlineClass = airlineClass;
    }

    public long getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(long flightTimeInMinutes) {
        this.flightDuration = flightTimeInMinutes;
    }
}
