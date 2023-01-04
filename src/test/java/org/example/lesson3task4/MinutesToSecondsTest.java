package org.example.lesson3task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsTest {

    @org.junit.jupiter.api.Test
    void ShouldConvertTwoMinutesTo120Seconds() {
        int convertMinutesToSeconds = MinutesToSeconds.convertMinutesToSeconds(2);
        Assertions.assertEquals(120, convertMinutesToSeconds);
    }

    @org.junit.jupiter.api.Test
    void ShouldConvert20MinutesIntoSeconds() {
        int convertMinutesToSeconds = MinutesToSeconds.convertMinutesToSeconds(20);
        Assertions.assertEquals(1200, convertMinutesToSeconds);
    }
}