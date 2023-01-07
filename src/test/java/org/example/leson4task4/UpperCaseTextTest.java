package org.example.leson4task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTextTest {

    @Test
    void shouldUpperCaseAllLetters() {
        UpperCaseText upperCaseText = new UpperCaseText();
        String formatText = upperCaseText.formatText("ala NIE ma KOta");
        Assertions.assertEquals("ALA NIE MA KOTA", formatText);
    }
}