package org.example.lesson7task2;

public class UpperCaseFormatter {
    public static String formatText(String text) {
        if (text == null) {
            return "";
        }
        return text.toUpperCase();
    }
}
