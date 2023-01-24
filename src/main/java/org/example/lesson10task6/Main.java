package org.example.lesson10task6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(BirthDate.age(LocalDate.parse("2004-01-18")));
        System.out.println(BirthDate.weekOfYear(LocalDate.parse("1997-08-20")));
        System.out.println(BirthDate.dayOfBirth(LocalDate.parse("1994-05-20")));
    }
}