package Strategy;

import Parsing.Flight;

import java.util.List;

public class FilterContext {
    private IFlightSearchStrategy iFlightSearchStrategy;

    public FilterContext(IFlightSearchStrategy iFlightSearchStrategy){
        this.iFlightSearchStrategy = iFlightSearchStrategy;
    }
    public List<Flight> filter(List<Flight>flights, FilterInput filterInput){
        return iFlightSearchStrategy.searchFlights(flights,filterInput);
    }
}
