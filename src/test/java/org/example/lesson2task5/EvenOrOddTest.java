package org.example.lesson2task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void shouldBeEvenWhenCheckingIfEven() {
        boolean result = EvenOrOdd.isEven(6);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldBeNotEvenWhenCheckingIfEven() {
        boolean result = EvenOrOdd.isEven(7);
        Assertions.assertFalse(result);
    }

    @Test
    void shouldBeOddWhenCheckingIfOdd() {
        boolean result = EvenOrOdd.isOdd(9);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldBeNotOddWhenCheckingIfOdd() {
        boolean result = EvenOrOdd.isOdd(10);
        Assertions.assertFalse(result);
    }
}