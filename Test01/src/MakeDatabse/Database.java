package MakeDatabse;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private List instance;

    public List getInstance(){
        if (instance!=null){
            return new ArrayList<>();
        }
        return instance;
    }



        public static List<Person> getDatabase() {
            List<Person> people;
            String jsonString;
            try {
                jsonString = Parser.getStringOfFileAttributes("people.json");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            TypeToken<List<Person>> token = new TypeToken<List<Person>>() {};
            people = Parser.parseJsonToListOfObjects(jsonString, token);

            return people;
        }


    @Override
    public String toString() {
        return "Database{" +
                "instance=" + instance +
                '}';
    }
}
