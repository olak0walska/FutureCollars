package org.example.lesson10task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pesel.isPesel("12345678901"));
        System.out.println(Pesel.isPesel("123456a8901"));
        System.out.println(Pesel.isPesel("12asdfb"));
        System.out.println(Pesel.isPesel("12345678901"));
    }
}