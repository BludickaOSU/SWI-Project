package Strategy;

import Parsing.Flight;

import java.util.Comparator;
import java.util.List;

public class FilterByAeroclass extends Filter implements IFlightSearchStrategy{
    @Override
    public List<Flight> searchFlights(List<Flight> flights, FilterInput filterInput) {
        return sortByClassType(super.searchFlights(flights,filterInput));
    }

    public List<Flight>sortByClassType(List<Flight> flights){
        flights.sort(Comparator.comparing(Flight::getAeroClass));
        return flights;
    }
}
