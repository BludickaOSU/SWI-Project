package model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileManager {

    public static ArrayList<String> loadFileLines(String path) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            lines = new ArrayList<>(Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));
            System.out.println("LOADED: " + path);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return lines;
    }
}
