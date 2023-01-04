package org.example.lesson4task7;

public class Main {
    public static void main(String[] args) {
        WeekdayName weekdayName = new WeekdayName();
        System.out.println(weekdayName.getWeekdayName(Weekday.Monday));
        System.out.println(weekdayName.getWeekdayName(Weekday.Wednesday));
    }
}