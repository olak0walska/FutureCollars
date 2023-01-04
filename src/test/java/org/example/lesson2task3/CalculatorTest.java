package org.example.lesson2task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoValues2and2() {
        int sum = Calculator.sum(2, 2);
        Assertions.assertEquals(4, sum);
    }

    @Test
    void shouldSubtractfirstValueFromSecondValue() {
        int subtract = Calculator.subtract(5, 3);
        Assertions.assertEquals(2, subtract);
    }

    @Test
    void shouldMultiplyFirstValueWithSecondValue() {
        int multiply = Calculator.multiply(4, 3);
        Assertions.assertEquals(12, multiply);
    }

    @Test
    void shouldDivideFirstValueBySecondValue() {
        double divide = Calculator.divide(8, 2);
        Assertions.assertEquals(4, divide);
    }
}