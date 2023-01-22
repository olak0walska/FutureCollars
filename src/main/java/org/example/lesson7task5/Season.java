package org.example.lesson7task5;

import java.time.Month;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL
}

class SeasonDuration {
    public static Season getSeason(Month month) {
        if ((month == null)) {
            throw new IllegalArgumentException("There's no null month");
        }
        if (month == Month.JANUARY || month == Month.FEBRUARY || month == Month.DECEMBER) {
            return Season.WINTER;
        } else if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY) {
            return Season.SPRING;
        } else if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            return Season.SUMMER;
        } else
            return Season.FALL;
    }
}

