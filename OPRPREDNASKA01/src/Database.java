import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    public ArrayList<Person> people = new ArrayList<>();


    public static void personCheck(ArrayList<Person> arrayList){
        if (arrayList.contains(null)){
            arrayList.remove(null);
        }
        System.out.println(arrayList);
    }
    public static void addPersonToDatabase(ArrayList<Person> database){
        Scanner sc1 = new Scanner(System.in);
        boolean onOff = true;
        while (onOff) {
            System.out.println("Chcete přidat další osobu? Napište Ano/Ne: ");
            String answer = sc1.nextLine();
            if (answer.equalsIgnoreCase("Ano")) {
                System.out.print("Zadej jméno: ");
                String name = sc1.nextLine();
                System.out.print("Zadej věk: ");
                int age = Integer.parseInt(sc1.nextLine());
                System.out.print("Zadej id: ");
                int id = Integer.parseInt(sc1.nextLine());
                System.out.print("Zadej gender ");
                String gender = sc1.nextLine();
                database.add(Person.createPerson(name, age, id, gender));
            } else if (answer.equalsIgnoreCase("Ne")) {
                break;
            } else {
                System.out.println("Neplatná volba, zkuste to znovu.");
            }
        }
    }


    public static ArrayList<Person> jsonToJava(ArrayList<Person> database, Gson gson){
        ArrayList<Person> arrayListOut = database;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\json\\myjsonFile.json"));
            Person[] persons = gson.fromJson(bufferedReader, Person[].class);

            for (Person person: persons){
                arrayListOut.add(person);
            }
            bufferedReader.close();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    return arrayListOut;
    }
    public static void javaToJson(ArrayList<Person> database,String json){


        try (FileWriter file = new FileWriter("D:\\json\\myjsonFile.json")){
            file.write(json);
            file.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }



}
