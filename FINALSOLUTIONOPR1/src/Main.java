import Strategy.Flight;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightSearchEngine searchEngine = new FlightSearchEngine();
        searchEngine.addStrategy(new CheapestFlightSearchStrategy);
        List<Flight> flights = searchEngine.searchFlights(filter, IFlightSeatchStrategy);
    }
}