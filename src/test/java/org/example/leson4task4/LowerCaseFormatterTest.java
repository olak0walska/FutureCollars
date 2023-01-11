package org.example.leson4task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseFormatterTest {

    @Test
    void shouldLowerCaseAllLetters() {
        //given
        String text = "ALA ma kOta";

        //when
        LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();
        String formattedText = lowerCaseFormatter.formattedText(text);

        //then
        Assertions.assertEquals("ala ma kota", formattedText);
    }
}