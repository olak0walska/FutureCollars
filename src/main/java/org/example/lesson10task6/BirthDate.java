package org.example.lesson10task6;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class BirthDate {
    public static int age(LocalDate dateOfBirth) {
        LocalDate dateNow = LocalDate.now();
        int age = dateNow.getYear() - dateOfBirth.getYear();
        return age;
    }

    public static int weekOfYear(LocalDate dateOfBirth) {
        int week = dateOfBirth.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
        return week;
    }

    public static String dayOfBirth(LocalDate dateOfBirth) {
        String day = String.valueOf(dateOfBirth.getDayOfWeek());
        return day;
    }
}
