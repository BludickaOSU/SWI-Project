package Flights.data;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileProvider {
    private static FileProvider instance;

    private FileProvider() {

    }

    public static synchronized FileProvider getInstance()
    {
        if (instance == null){
            instance = new FileProvider();
        }
        return instance;
    }

    private static File getFile(String path) {
        return new File(path);
    }

    public static List<String> fileToStringLines(String path) {
        try {
            return Files.readAllLines(getFile(path).toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
