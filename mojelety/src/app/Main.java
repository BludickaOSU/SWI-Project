package app;

import app.filter.*;
import enums.EAirlineClass;
import model.Connection;
import model.ConnectionManagerSingleton;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Connection> results = new FilterContext(new FilterByPrice())
                .filter(ConnectionManagerSingleton.getInstance().getConnections(),
                        new FilterInput()
                                .setPlaceFrom("Paříž")
                                .setPlaceTo("Londýn")
                                //.setAirlineClass(EAirlineClass.ECONOMIC)
                                .setMinPrice(1800.)
                                .setMaxPrice(4000.)
                                .setAllowChange(true)
                                //.descending()
                );

        results.forEach(c -> System.out.println(c.toString()));
    }
}
