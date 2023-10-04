package Flights.data;


import Flights.Flight.Flight;


import java.time.LocalDateTime;

public class FlightsProvider {
    private static Flight parseFlights(String[] items) {
         String flightName = items[0];
         String route = items[1];
         LocalDateTime leavingDate = LocalDateTime.parse(items[2]) ;
         LocalDateTime arrivingDate = LocalDateTime.parse(items[3]) ;
         String aerolineName = items[5];
         double price = Double.parseDouble(items[6]);
         String aeroClass  = items[7];

        return new Flight(flightName,route,leavingDate,arrivingDate,aerolineName,price,aeroClass);
    }



}
