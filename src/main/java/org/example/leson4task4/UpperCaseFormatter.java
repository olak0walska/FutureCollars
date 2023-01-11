package org.example.leson4task4;

public class UpperCaseFormatter implements TextFormatter {
    @Override
    public String formattedText(String text) {
        return text.toUpperCase();
    }
}