package Strategy;

import Parsing.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter implements IFlightSearchStrategy{
    @Override
    public List<Flight> searchFlights(List<Flight> flights, FilterInput filterInput) {
        return flights.stream()
                .filter(f -> (filterInput.getFinishPlace() == null || f.getFinishCity().equals(filterInput.getFinishPlace())))
                .filter(f -> (filterInput.getStartingPlace() == null || f.getStartingCity().equals(filterInput.getStartingPlace())))
                .filter(f -> (filterInput.getArrivingTime() == null || f.getArrivingTime().equals(filterInput.getArrivingTime())))
                .filter(f -> (filterInput.getDepartureTime() == null || f.getDepartureTime().equals(filterInput.getDepartureTime())))
                .filter(f -> (filterInput.getNameOfAirline() == null || f.getAerlineName().equals(filterInput.getNameOfAirline())))
                .filter(f -> (filterInput.getAeroLineClass() == null || f.getAeroClass().equals(filterInput.getAeroLineClass())))
                .filter(f -> (f.getPrice() <= filterInput.getMaxPrice() && f.getPrice() >= filterInput.getMinPrice()))
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
