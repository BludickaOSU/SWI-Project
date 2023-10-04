package Strategy;

import java.util.List;

public interface IFlightSeatchStrategy {
    List<Flight> searchFlights(SearchInput searchInput);
}
