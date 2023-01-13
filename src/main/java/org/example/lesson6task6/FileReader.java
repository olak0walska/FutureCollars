package org.example.lesson6task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader extends FileWriter {

    public static void readFile(String filePath) {
        try {
            String text = Files.readString(Path.of(filePath));
            FileWriter.writeToFile("C:\\Users\\Acer\\Desktop\\output.txt", text.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
