package org.example.leson4task4;

public class LowerCaseText implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}