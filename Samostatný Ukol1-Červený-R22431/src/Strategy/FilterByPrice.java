package Strategy;

import Parsing.Flight;


import java.util.Comparator;
import java.util.List;

public class FilterByPrice extends Filter implements IFlightSearchStrategy{


    @Override
    public List<Flight> searchFlights(List<Flight> flights, FilterInput filterInput) {
        return sortByPrice(super.searchFlights(flights,filterInput));
    }

    public List<Flight> sortByPrice(List<Flight> flights){
        flights.sort(Comparator.comparing(Flight::getPrice));
        return flights;
    }
}
