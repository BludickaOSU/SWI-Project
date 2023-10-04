import Parsing.Flight;
import Parsing.FlightDatabase;
import Strategy.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

/*Zkouška FilterByPriceStrategy

    List<Flight> flights = new FilterContext(new FilterByPrice())
            .filter(FlightDatabase.getInstance().parseFlightDatabase("lety.TXT"),new FilterInput()
                    .setFinishPlace("Řím")
                    .setMaxPrice(5000.0).setNameOfAirline("British Airways"));
                    for(Flight f:flights){
                    System.out.println(f);
                    }
 */


   /*ZkouškaFilterByShortestDuration
    List<Flight> flights = new FilterContext(new FilterByShortestDuration())
            .filter(FlightDatabase.getInstance().parseFlightDatabase("lety.TXT"),
            new FilterInput().setFinishPlace("Řím"));

    for (Flight f:flights){
        System.out.println(f);
        System.out.println(f.getDuration());
    }
*/

    List<Flight> flights = new FilterContext(new FilterByAeroclass())
            .filter(FlightDatabase.getInstance().getFlights(),
                    new FilterInput().setMaxPrice(10000.0));
        for (Flight f:flights){
            System.out.println(f);

        }

































    }
}