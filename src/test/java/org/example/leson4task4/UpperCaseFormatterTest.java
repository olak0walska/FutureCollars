package org.example.leson4task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseFormatterTest {

    @Test
    void shouldUpperCaseAllLetters() {
        //given
        String text = "ala NIE ma KOta";

        //when
        UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
        String formattedText = upperCaseFormatter.formattedText(text);

        //then
        Assertions.assertEquals("ALA NIE MA KOTA", formattedText);
    }
}