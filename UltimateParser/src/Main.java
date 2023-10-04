import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Period;
import java.util.List;

public class Main {
    public static void main(String[] args) {




         /*
        List<Person> people = null;
        try {
            people = Parser.parseJsonToListOfObjects(Parser.getStringOfFileAttributes("soubor.json"), new TypeToken<List<Person>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

            for (Person person : people) {
                System.out.println(person);
            }
    */
        List<Car> cars = null;
        try {
            cars = Parser.parseJsonToListOfObjects(Parser.getStringOfFileAttributes("auta.json"), new TypeToken<List<Car>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Car car : cars) {
            System.out.println(car);
        }


    }
}