package org.example.lesson4task7;

public class WeekdayName {
    public String getWeekdayName(Weekday weekday) {
        switch (weekday) {
            case Monday:
                return "Monday";
            case Tuesday:
                return "Tuesday";
            case Wednesday:
                return "Wednesday";
            case Thursday:
                return "Thursday";
            case Friday:
                return "Friday";
            case Saturday:
                return "Saturday";
            case Sunday:
                return "Sunday";
            default:
                return "There's no a such day!";
        }
    }
}