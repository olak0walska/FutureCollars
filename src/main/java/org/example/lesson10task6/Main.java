package org.example.lesson10task6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(2004, 01, 18);

        int age = dateNow.getYear() - dateOfBirth.getYear();
        String dayOfBirth = String.valueOf(dateOfBirth.getDayOfWeek());
        int weekOfYear = (dateOfBirth.getDayOfYear() / 7) + 1;

        System.out.println(age);
        System.out.println(dayOfBirth);
        System.out.println(weekOfYear);
    }
}