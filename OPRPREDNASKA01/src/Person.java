import java.util.Random;

public class Person {
    private String name;
    private int age;

    private int id;

    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String isGender() {
        return gender;
    }

    public Person(String name, int age, int id, String gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }

    public static String generateRandomString(int length) {
        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
    public static Person createPerson(String name, int age,int id, String gender){
        if (age < 0) return null;
        if (name.length()<3) return null;

        else {
            return new Person(name,age,id,gender);
        }

    }

    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                '}'+"\n";
    }
}
