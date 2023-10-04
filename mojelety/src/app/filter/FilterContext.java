package app.filter;

import model.Connection;

import java.util.ArrayList;

public class FilterContext {

    private IFilterContext algorithm;

    public FilterContext(IFilterContext algorithm) {
        this.algorithm = algorithm;
    }

    public ArrayList<Connection> filter(ArrayList<Connection> connections, FilterInput filterInput) {
        return algorithm.filter(connections, filterInput);
    }

}
