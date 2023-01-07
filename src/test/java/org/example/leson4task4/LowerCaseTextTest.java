package org.example.leson4task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseTextTest {

    @Test
    void shouldLowerCaseAllLetters() {
        LowerCaseText lowerCaseText = new LowerCaseText();
        String formatText = lowerCaseText.formatText("ALA ma kOta");
        Assertions.assertEquals("ala ma kota", formatText);
    }
}