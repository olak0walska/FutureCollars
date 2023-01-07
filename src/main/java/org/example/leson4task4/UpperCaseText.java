package org.example.leson4task4;

public class UpperCaseText implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}