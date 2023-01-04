package org.example.lesson2task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {

    @Test
    void shouldSayThatSomeoneIsAdult() {
        boolean isAdult = Age.isAdult(19);
        Assertions.assertTrue(isAdult);
    }

    @Test
    void shouldSayThatSomeoneIsNotAdult() {
        boolean isAdult = Age.isAdult(15);
        Assertions.assertFalse(isAdult);
    }
}