package org.example.lesson7task5;

import java.time.Month;

public class SeasonDuration {
    public String getSeason(Month month) {
        switch (month) {
            case JANUARY:
            case FEBRUARY:
            case DECEMBER:
                return Season.WINTER.name();
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING.name();
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER.name();
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.FALL.name();
            default:
                return "There is no such a month!";
        }
    }
}