package org.example.lesson3task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsTest {

    @org.junit.jupiter.api.Test
    void shouldConvertTwoMinutesTo120Seconds() {
        //when
        int seconds = MinutesToSeconds.seconds(2);

        //then
        Assertions.assertEquals(120, seconds);
    }

    @org.junit.jupiter.api.Test
    void shouldConvert20MinutesIntoSeconds() {
        //when
        int seconds = MinutesToSeconds.seconds(20);

        //then
        Assertions.assertEquals(1200, seconds);
    }
}