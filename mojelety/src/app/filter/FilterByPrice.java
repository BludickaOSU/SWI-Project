package app.filter;

import model.Connection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FilterByPrice extends Filter implements IFilterContext {

    @Override
    public ArrayList<Connection> filter(ArrayList<Connection> connections, FilterInput fi) {
        return sortByPrice(super.filter(connections, fi), fi.getDescending());
    }

    public ArrayList<Connection> sortByPrice(ArrayList<Connection> connections, Boolean desc) {
        connections.sort(Comparator.comparing(Connection::getPrice));
        if(desc) Collections.reverse(connections);
        return connections;
    }
}
