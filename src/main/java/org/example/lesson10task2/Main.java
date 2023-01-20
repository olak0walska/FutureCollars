package org.example.lesson10task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher("12345678901");
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}