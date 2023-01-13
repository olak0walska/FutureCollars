package org.example.lesson7task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

    @ParameterizedTest
    @CsvSource(value = {"123:6", "111:3", "222:6"}, delimiter = ':')
    void shouldSumDigits(int input, int expected) {
        Assertions.assertEquals(expected, SumOfDigits.sumOfDigits(input));
    }
}