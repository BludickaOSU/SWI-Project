import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        String filePath = "src/Dictionary.json";
        HashMap<Character, String> map = Coder.parseJSONToHashMap(filePath);

        System.out.println(Coder.encode("Ahoj", map));


    }
}
