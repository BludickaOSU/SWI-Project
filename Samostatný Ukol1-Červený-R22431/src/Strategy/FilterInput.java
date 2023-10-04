package Strategy;

import java.sql.Date;
import java.time.LocalDateTime;

public class FilterInput {
    private String startingPlace = null;

    private String finishPlace = null;

    private Double minPrice = Double.MIN_VALUE;

    private Double maxPrice = Double.MAX_VALUE;

    private LocalDateTime departureTime = null;

    private LocalDateTime arrivingTime = null;

    private String aeroLineClass = null;

    private String nameOfAirline = null;


    public FilterInput clearEverything(){
        setMaxPrice(Double.MAX_VALUE);
        setMinPrice(Double.MIN_VALUE);
        setAeroLineClass(null);
        setFinishPlace(null);
        setStartPlace(null);
        setFinishPlace(null);
        setDepartureTime(null);
        setArrivingTime(null);
        return this;
    }

    public String getStartingPlace() {
        return startingPlace;
    }
    public FilterInput setStartPlace(String startingPlace){
        this.startingPlace = startingPlace;
        return this;
    }

    public String getFinishPlace() {
        return finishPlace;
    }
    public FilterInput setFinishPlace(String finishPlace){
        this.finishPlace = finishPlace;
        return this;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivingTime() {
        return arrivingTime;
    }

    public String getAeroLineClass() {
        return aeroLineClass;
    }

    public String getNameOfAirline() {
        return nameOfAirline;
    }
    public FilterInput setMinPrice(Double minPrice){
        this.minPrice = minPrice;
        return this;
    }
    public FilterInput setMaxPrice(Double maxPrice){
        this.maxPrice = maxPrice;
        return this;
    }
    public FilterInput setAeroLineClass(String aeroLineClass){
        this.aeroLineClass = aeroLineClass;
        return this;
    }
    public FilterInput setNameOfAirline(String nameOfAirline){
        this.nameOfAirline = nameOfAirline;
        return this;
    }
    public FilterInput setDepartureTime(LocalDateTime departureTime){
        this.departureTime = departureTime;
        return this;
    }
    public FilterInput setArrivingTime(LocalDateTime arrivingTime){
        this.arrivingTime = arrivingTime;
        return this;
    }
}
