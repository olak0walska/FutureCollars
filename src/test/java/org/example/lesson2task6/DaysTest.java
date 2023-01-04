package org.example.lesson2task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysTest {
    @Test
    void shouldReturnMonday() {
        String day = Days.getWeekday(1);
        Assertions.assertEquals("Monday", day);
    }

    @Test
    void shouldReturnTuesday() {
        String day = Days.getWeekday(2);
        Assertions.assertEquals("Tuesday", day);
    }

    @Test
    void shouldReturnWednesday() {
        String day = Days.getWeekday(3);
        Assertions.assertEquals("Wednesday", day);
    }

    @Test
    void shouldReturnThursday() {
        String day = Days.getWeekday(4);
        Assertions.assertEquals("Thursday", day);
    }

    @Test
    void shouldReturnFriday() {
        String day = Days.getWeekday(5);
        Assertions.assertEquals("Friday", day);
    }

    @Test
    void shouldReturnWeekendBySaturday() {
        String day = Days.getWeekday(6);
        Assertions.assertEquals("Weekend", day);
    }

    @Test
    void shouldReturnWeekendBySunday() {
        String day = Days.getWeekday(7);
        Assertions.assertEquals("Weekend", day);
    }

    @Test
    void shouldReturnThereIsNoSuchADay() {
        String day = Days.getWeekday(13);
        Assertions.assertEquals("There is no such a day!", day);
    }
}
