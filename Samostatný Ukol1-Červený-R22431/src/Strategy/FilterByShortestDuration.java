package Strategy;

import Parsing.Flight;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilterByShortestDuration extends Filter implements IFlightSearchStrategy{

    @Override
    public List<Flight> searchFlights(List<Flight> flights, FilterInput filterInput) {
        return sortByDuration(super.searchFlights(flights, filterInput));
    }

    public List<Flight>sortByDuration(List<Flight> flights){
        flights.sort(Comparator.comparing(Flight::getDuration));
        Collections.reverse(flights);
        return flights;


    }
}
