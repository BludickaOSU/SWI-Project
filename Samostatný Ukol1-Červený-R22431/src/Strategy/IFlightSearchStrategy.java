package Strategy;

import Parsing.Flight;

import java.util.List;

public interface IFlightSearchStrategy {
    List<Flight> searchFlights(List<Flight> flights, FilterInput filterInput);
}
