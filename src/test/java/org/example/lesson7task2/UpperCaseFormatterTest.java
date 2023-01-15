package org.example.lesson7task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseFormatterTest {

    @ParameterizedTest
    @ValueSource(strings = {"aLA", "Ma", "DwA", "KoTy"})
    void shouldVerifyStringInUpperCase(String input) {
        String expectedValue;

        //when
        expectedValue = input.toUpperCase();

        //then
        Assertions.assertEquals(expectedValue, UpperCaseFormatter.formatText(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldVerifyIfStringIsNullOrEmpty(String input){
        String expectedValue;

        //when
        expectedValue = "";

        //then
        Assertions.assertEquals(expectedValue, UpperCaseFormatter.formatText(input));
    }
}