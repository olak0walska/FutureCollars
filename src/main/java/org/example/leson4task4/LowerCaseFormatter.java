package org.example.leson4task4;

public class LowerCaseFormatter implements TextFormatter {
    @Override
    public String formattedText(String text) {
        return text.toLowerCase();
    }
}