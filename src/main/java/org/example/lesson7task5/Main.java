package org.example.lesson7task5;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        SeasonDuration seasonDuration = new SeasonDuration();
        System.out.println(seasonDuration.getSeason(Month.JANUARY));
        System.out.println(seasonDuration.getSeason(Month.FEBRUARY));
        System.out.println(seasonDuration.getSeason(Month.MARCH));
        System.out.println(seasonDuration.getSeason(Month.APRIL));
        System.out.println(seasonDuration.getSeason(Month.MAY));
        System.out.println(seasonDuration.getSeason(Month.JUNE));
        System.out.println(seasonDuration.getSeason(Month.JULY));
        System.out.println(seasonDuration.getSeason(Month.AUGUST));
        System.out.println(seasonDuration.getSeason(Month.SEPTEMBER));
        System.out.println(seasonDuration.getSeason(Month.OCTOBER));
        System.out.println(seasonDuration.getSeason(Month.NOVEMBER));
        System.out.println(seasonDuration.getSeason(Month.DECEMBER));
    }
}
