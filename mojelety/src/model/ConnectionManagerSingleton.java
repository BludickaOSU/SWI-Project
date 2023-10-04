package model;

import app.filter.FilterContext;

import java.util.ArrayList;

public class ConnectionManagerSingleton {

    static final String FLIGHTS_LIST_PATH = "src/res/FlightsList.txt";
    private static ConnectionManagerSingleton inst;
    private ArrayList<Connection> connections = new ArrayList<>();
    private FilterContext filterContext;


    private ConnectionManagerSingleton() {
        loadConnections();
    }

    private void loadConnections() {
        connections.clear();
        for(String line : FileManager.loadFileLines(FLIGHTS_LIST_PATH)) {
            connections.add(new Connection(line));
        }
    }

    public static ConnectionManagerSingleton getInstance() {
        if (inst == null) inst = new ConnectionManagerSingleton();
        return inst;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

}
