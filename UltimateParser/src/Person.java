import java.util.List;

public class Person {
    private String name;
    private int age;
    private String city;
    private String occupation;
    private List<String> hobbies;

    public Person() {
    }

    public Person(String name, int age, String city, String occupation, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.occupation = occupation;
        this.hobbies = hobbies;
    }

    // Gettery a settery pro atributy

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", occupation='" + occupation + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
