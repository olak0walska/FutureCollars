package org.example.lesson10task6;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        System.out.println(BirthDate.getAge(LocalDate.parse("2004-01-18")));
        System.out.println(BirthDate.getAge(LocalDate.parse("2004-05-24")));
        System.out.println(BirthDate.getAge(LocalDate.parse("2004-11-03")));
        System.out.println(BirthDate.getWeekOfYear(LocalDate.parse("1997-08-20")));
        System.out.println(BirthDate.getDayOfBirth(LocalDate.parse("1994-05-20")));
    }
}
