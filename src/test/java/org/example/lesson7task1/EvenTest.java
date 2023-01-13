package org.example.lesson7task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void shouldVerifyNumberIsEven(int input) {
        Assertions.assertTrue(Even.isEven(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {21, 43, 65, 87, 109})
    void shouldVerifyNumberIsNotEven(int input) {
        Assertions.assertFalse(Even.isEven(input));
    }
}