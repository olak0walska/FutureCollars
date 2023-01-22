package org.example.lesson7task5;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        System.out.println(SeasonDuration.getSeason(Month.JANUARY));
        System.out.println(SeasonDuration.getSeason(Month.APRIL));
        System.out.println(SeasonDuration.getSeason(Month.JULY));
        System.out.println(SeasonDuration.getSeason(Month.SEPTEMBER));
        System.out.println(SeasonDuration.getSeason(null));
    }
}
