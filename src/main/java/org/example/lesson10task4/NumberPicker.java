package org.example.lesson10task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPicker {
    public static String getTypeOfNumber(String number) {
        Pattern pattern = Pattern.compile("^[+-]?[0-9]+$");
        Matcher matcher = pattern.matcher(number);
        boolean matches = matcher.matches();
        if (matches) {
            return number + " to liczba całkowita";
        } else {
            Pattern pattern2 = Pattern.compile("^[+-]?([0-9]*)[.]{1}[0-9]+$");
            Matcher matcher2 = pattern2.matcher(number);
            boolean matches2 = matcher2.matches();
            if (matches2)
                return number + " to liczba zmiennoprzecinkowa";
            if (matches2 == false || matches == false) {
                Pattern pattern3 = Pattern.compile("^(?:-?\\d*)\\.?\\d+[eE][-\\+]?\\d+$");

                Matcher matcher3 = pattern3.matcher(number);
                boolean matches3 = matcher3.matches();
                if (matches3)
                    return number + " to liczba w notacji naukowej";
            }
        }
        return "";
    }
}