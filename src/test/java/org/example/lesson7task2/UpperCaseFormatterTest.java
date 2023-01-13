package org.example.lesson7task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseFormatterTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"aLA", "Ma", "DwA", "KoTy"})
    void shouldVerifyStringTrimAndInUpperCase(String input) {
        String expectedValue;
        if (input != null) {
            expectedValue = input.toUpperCase();
        } else {
            expectedValue = "";
        }
        Assertions.assertEquals(expectedValue, UpperCaseFormatter.formatText(input));
    }
}