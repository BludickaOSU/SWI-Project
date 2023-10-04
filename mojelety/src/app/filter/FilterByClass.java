package app.filter;

import model.Connection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FilterByClass extends Filter implements IFilterContext {

    @Override
    public ArrayList<Connection> filter(ArrayList<Connection> connections, FilterInput fi) {
        return sortByClass(super.filter(connections, fi), fi.getDescending());
    }

    public ArrayList<Connection> sortByClass(ArrayList<Connection> connections, Boolean desc) {
        connections.sort(Comparator.comparing(Connection::getAirlineClass));
        if(desc) Collections.reverse(connections);
        return connections;
    }
}
