package Strategy;



import Flights.Flight.Flight;

import java.util.List;

public interface IFlightSearchStrategy {
    public List<Flight> searchFlights(List<Flight> flights, SearchInput searchInput);

}
