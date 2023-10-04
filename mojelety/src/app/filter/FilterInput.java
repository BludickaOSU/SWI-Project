package app.filter;

import enums.EAirlineClass;

import java.time.ZonedDateTime;

public class FilterInput {

    private String flightID = null;
    private String placeFrom = null;
    private String placeTo = null;
    private ZonedDateTime departureTime = null;
    private ZonedDateTime arrivalTime = null;
    private String airline = null;
    private Double minPrice = 0.0;
    private Double maxPrice = Double.MAX_VALUE;
    private EAirlineClass airlineClass = null;
    private Boolean allowChange = false;
    private Boolean descending = false;

    public FilterInput clear() {
        setFlightID(null);
        setPlaceTo(null);
        setPlaceFrom(null);
        setArrivalTime(null);
        setDepartureTime(null);
        setAirline(null);
        setMinPrice(0.0);
        setMaxPrice(Double.MAX_VALUE);
        setAirlineClass(null);
        setAllowChange(false);
        ascending();
        return this;
    }

    public String getFlightID() {
        return flightID;
    }

    public FilterInput setFlightID(String flightID) {
        this.flightID = flightID;
        return this;
    }

    public String getPlaceFrom() {
        return placeFrom;
    }

    public FilterInput setPlaceFrom(String placeFrom) {
        this.placeFrom = placeFrom;
        return this;
    }

    public String getPlaceTo() {
        return placeTo;
    }

    public FilterInput setPlaceTo(String placeTo) {
        this.placeTo = placeTo;
        return this;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public FilterInput setDepartureTime(ZonedDateTime departureTime) {
        this.departureTime = departureTime;
        return this;
    }

    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }

    public FilterInput setArrivalTime(ZonedDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
        return this;
    }

    public String getAirline() {
        return airline;
    }

    public FilterInput setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public FilterInput setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public FilterInput setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public EAirlineClass getAirlineClass() {
        return airlineClass;
    }

    public FilterInput setAirlineClass(EAirlineClass airlineClass) {
        this.airlineClass = airlineClass;
        return this;
    }

    public Boolean getAllowChange() {
        return allowChange;
    }

    public FilterInput setAllowChange(Boolean allowChange) {
        this.allowChange = allowChange;
        return this;
    }

    public FilterInput descending() {
        this.descending = true;
        return this;
    }

    public FilterInput ascending() {
        this.descending = false;
        return this;
    }

    public Boolean getDescending() {
        return this.descending;
    }
}
