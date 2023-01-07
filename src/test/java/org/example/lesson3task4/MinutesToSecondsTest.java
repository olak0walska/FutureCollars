package org.example.lesson3task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsTest {
    @Test
    void shouldConvertMinutesToSeconds() {
        //when
        int seconds = MinutesToSeconds.convertToSeconds(20);

        //then
        Assertions.assertEquals(1200, seconds);
    }
}