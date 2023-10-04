import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;


public class Main {
    public static void main(String[] args) {

        //Inicializace pole
        ArrayList<Person> database = new ArrayList<>();
        //Inicializace pluginu Gson
        Gson gson = new Gson();
        //Přečteni Json souboru a zapsani hodnot do pole
        Database.jsonToJava(database,gson);
        //Pridani osoby do databaze
        Database.addPersonToDatabase(database);
        //Kontrola jestli osoba splnuje parametry
        Database.personCheck(database);
        //Metoda na převedeni Arraylistu database do Jsonu
        String json = gson.toJson(database);
        Database.javaToJson(database,json);



    }
}