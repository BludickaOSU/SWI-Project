package MakeDatabse;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String adress;
    private int income;
    private int expenses;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", income=" + income +
                ", expenses=" + expenses +
                '}';
    }
}
