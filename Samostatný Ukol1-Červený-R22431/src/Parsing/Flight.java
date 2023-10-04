package Parsing;



import java.time.Duration;
import java.time.LocalDateTime;

public class Flight {
    private String nameOfFlight;
    private String startingCity;
    private String finishCity;
    private LocalDateTime departureTime;
    private LocalDateTime arrivingTime;
    private String aerlineName;

    private Double price;
    private String earoClass;




    public Flight(String nameOfFlight, String startingCity, String finishCity, LocalDateTime departureTime,
                  LocalDateTime arrivingTime, String aerlineName,Double price, String earoClass) {
        this.nameOfFlight = nameOfFlight;
        this.startingCity = startingCity;
        this.finishCity = finishCity;
        this.departureTime = departureTime;
        this.arrivingTime = arrivingTime;
        this.aerlineName = aerlineName;
        this.price = price;
        this.earoClass = earoClass;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNameOfFlight() {
        return nameOfFlight;
    }

    public void setNameOfFlight(String nameOfFlight) {
        this.nameOfFlight = nameOfFlight;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public void setStartingCity(String startingCity) {
        this.startingCity = startingCity;
    }

    public String getFinishCity() {
        return finishCity;
    }

    public void setFinishCity(String finishCity) {
        this.finishCity = finishCity;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(LocalDateTime arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public String getAerlineName() {
        return aerlineName;
    }

    public void setAerlineName(String aerlineName) {
        this.aerlineName = aerlineName;
    }

    public String getAeroClass() {
        return earoClass;
    }

    public void setEaroClass(String earoClass) {
        this.earoClass = earoClass;
    }

    public Duration getDuration(){
        Duration duration = Duration.between(getArrivingTime(),getDepartureTime());
        return duration;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "nameOfFlight='" + nameOfFlight + '\'' +
                ", startingCity='" + startingCity + '\'' +
                ", finishCity='" + finishCity + '\'' +
                ", departureTime=" + departureTime +
                ", arrivingTime=" + arrivingTime +
                ", aerlineName='" + aerlineName + '\'' +
                ", price=" + price +
                ", earoClass='" + earoClass + '\'' +
                '}';
    }
}
