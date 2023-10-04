package Parsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    private static FlightDatabase instance;
    private List<Flight> flights = new ArrayList<>();
    private String path = "lety.TXT";

    private FlightDatabase(){
    parseFlightDatabase(path);
    }
    public static FlightDatabase getInstance(){
        if (instance==null){
            instance = new FlightDatabase();
        }
        return instance;
    }
    private void parseFlightDatabase(String filename){


        List<Flight> flightList = new ArrayList<>();



        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] flightData = line.split(",");
                if (flightData.length == 8) {
                    String nameOfFlight = flightData[0].trim();
                    String startingCity = flightData[1].trim();
                    String finishCity = flightData[2].trim();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy H:mm");
                    LocalDateTime departureTime = LocalDateTime.parse(flightData[3].trim(), formatter);
                    LocalDateTime arrivingTime = LocalDateTime.parse(flightData[4].trim(), formatter);
                    String aerlineName = flightData[5].trim();
                    double price = Double.parseDouble(flightData[6].trim().replaceAll(" ",""));
                    String earoClass = flightData[7].trim();

                    Flight flight = new Flight(nameOfFlight, startingCity, finishCity, departureTime, arrivingTime,
                            aerlineName, price, earoClass);
                    flights.add(flight);
                }
            }



    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flights=" + flights +
                '}';
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
