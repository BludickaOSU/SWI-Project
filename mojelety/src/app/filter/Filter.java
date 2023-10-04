package app.filter;

import model.Connection;
import model.ConnectionWithChange;

import java.util.ArrayList;

public class Filter implements IFilterContext {

    public ArrayList<Connection> filter(ArrayList<Connection> connections, FilterInput fi) {

        ArrayList<Connection> outConnections = new ArrayList<>();

        for (Connection c : connections) {
            if ((fi.getFlightID() == null || c.getFlightID().equals(fi.getFlightID()))
                    && (fi.getPlaceTo() == null || c.getPlaceTo().equals(fi.getPlaceTo()))
                    && (fi.getPlaceFrom() == null || c.getPlaceFrom().equals(fi.getPlaceFrom()))
                    && (fi.getArrivalTime() == null || c.getArrivalTime().equals(fi.getArrivalTime()))
                    && (fi.getDepartureTime() == null || c.getDepartureTime().equals(fi.getDepartureTime()))
                    && (fi.getAirline() == null || c.getAirline().equals(fi.getAirline()))
                    && (fi.getAirlineClass() == null || c.getAirlineClass().equals(fi.getAirlineClass()))
                    && (c.getPrice() <= fi.getMaxPrice() && c.getPrice() >= fi.getMinPrice())) {
                outConnections.add(c);
            }
        }

        if (fi.getAllowChange()) {

            for (Connection c1 : connections) {
                for (Connection c2 : connections) {

                    if (c1 == c2 || c1.getPlaceFrom().equals(fi.getPlaceTo())) continue;

                    double totalPrice = c2.getPrice() + c1.getPrice();

                    if (c1.getArrivalTime().isBefore(c2.getDepartureTime())
                            && (fi.getPlaceFrom() == null || c1.getPlaceFrom().equals(fi.getPlaceFrom()))
                            && c1.getPlaceTo().equals(c2.getPlaceFrom())
                            && c2.getPlaceTo().equals(fi.getPlaceTo())
                            && (fi.getAirlineClass() == null || (c1.getAirlineClass().equals(fi.getAirlineClass()) && c2.getAirlineClass().equals(c1.getAirlineClass())))
                            && (fi.getDepartureTime() == null || c1.getDepartureTime().equals(fi.getDepartureTime()))
                            && (fi.getArrivalTime() == null || c2.getArrivalTime().equals(fi.getArrivalTime()))
                            && totalPrice <= fi.getMaxPrice()
                            && totalPrice >= fi.getMinPrice()) {
                        outConnections.add(new ConnectionWithChange(c1, c2));
                    }
                }
            }
        }

        return outConnections;
    }
}
