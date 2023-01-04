package org.example.lesson6task0;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        writeToFile("C:\\Users\\Acer\\Desktop\\data.txt", "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku");
    }

    public static void writeToFile(String pathToFile, String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToFile))) {
            writer.write(text);
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("błąd");
        }
    }
}
