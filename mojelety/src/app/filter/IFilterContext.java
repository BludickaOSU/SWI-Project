package app.filter;

import model.Connection;

import java.util.ArrayList;

public interface IFilterContext {

    public ArrayList<Connection> filter(ArrayList<Connection> connections, FilterInput filterInput);

}
