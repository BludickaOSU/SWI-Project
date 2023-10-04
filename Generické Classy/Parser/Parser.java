import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Parser {


    public static <T> List<T> parseJsonToListOfObjects(String json, TypeToken<List<T>> typeToken) {
        Gson gson = new GsonBuilder().setLenient().create();
        return gson.fromJson(json, typeToken.getType());

    }
    public static String getStringOfFileAttributes(String filePath) throws IOException {
            String returnString = new String(Files.readAllBytes(Paths.get(filePath)));
            return returnString;
    }










}
