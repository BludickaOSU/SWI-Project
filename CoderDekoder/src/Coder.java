import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Coder {

    public static HashMap<Character, String> parseJSONToHashMap(String filePath) {
        HashMap<Character, String> map = new HashMap<>();

        try {
            // Inicializace BufferedReader pro čtení souboru
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            // Čtení obsahu souboru do StringBuilderu
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            reader.close();

            // Odebrání bílých znaků z obsahu JSON
            String jsonString = stringBuilder.toString().replaceAll("\\s+", "");

            // Kontrola základního formátu JSON
            if (!jsonString.startsWith("{") || !jsonString.endsWith("}")) {
                throw new IllegalArgumentException("Invalid JSON format");
            }

            // Odebrání vnějších složených závorek
            jsonString = jsonString.substring(1, jsonString.length() - 1);

            // Rozdělení obsahu JSON na páry klíč-hodnota
            String[] keyValuePairs = jsonString.split(",");

            // Procházení všech párových hodnot
            for (String pair : keyValuePairs) {
                // Rozdělení páru klíč-hodnota
                String[] keyValue = pair.split(":");
                // Odebrání uvozovek kolem klíče a hodnoty
                String key = keyValue[0].replaceAll("\"", "");
                String value = keyValue[1].replaceAll("\"", "");
                // Přidání do HashMapy
                map.put(key.charAt(0), value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }


    public static String encode(String input, HashMap<Character, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : input.toCharArray()) {
            String code = map.get(c);
            if (code == null) {
                throw new IllegalArgumentException("Character " + c + " is not in the dictionary");
            }
            stringBuilder.append(code);
        }
        return stringBuilder.toString();
    }



}
