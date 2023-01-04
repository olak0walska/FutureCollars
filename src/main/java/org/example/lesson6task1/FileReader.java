package org.example.lesson6task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    {
        try {
            String text = Files.readString(Path.of("C:\\Users\\Acer\\Desktop\\data.txt"));
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}