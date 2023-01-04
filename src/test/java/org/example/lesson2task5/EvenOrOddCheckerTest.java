package org.example.lesson2task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenOrOddCheckerTest {

    @Test
    void shouldBeEvenWhenCheckingIfEven() {
        //when
        boolean isEven = EvenOrOddChecker.isEven(6);

        //then
        Assertions.assertTrue(isEven);
    }

    @Test
    void shouldBeNotEvenWhenCheckingIfEven() {
        //when
        boolean isEven = EvenOrOddChecker.isEven(7);

        //then
        Assertions.assertFalse(isEven);
    }

    @Test
    void shouldBeOddWhenCheckingIfOdd() {
        //when
        boolean isOdd = EvenOrOddChecker.isOdd(9);

        //then
        Assertions.assertTrue(isOdd);
    }

    @Test
    void shouldBeNotOddWhenCheckingIfOdd() {
        //when
        boolean isOdd = EvenOrOddChecker.isOdd(10);

        //then
        Assertions.assertFalse(isOdd);
    }
}