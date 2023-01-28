package org.example.lesson10task4;

public class Main {
    public static void main(String[] args) {
        System.out.println(NumberPicker.getTypeOfNumber("342"));
        System.out.println(NumberPicker.getTypeOfNumber("5.34"));
        System.out.println(NumberPicker.getTypeOfNumber("756"));
        System.out.println(NumberPicker.getTypeOfNumber("1.234e+07"));
        System.out.println(NumberPicker.getTypeOfNumber("7.234243E-02"));
        System.out.println(NumberPicker.getTypeOfNumber("6.09"));
        System.out.println(NumberPicker.getTypeOfNumber("3457"));
        System.out.println(NumberPicker.getTypeOfNumber("87"));
        System.out.println(NumberPicker.getTypeOfNumber("1.0001"));
        System.out.println(NumberPicker.getTypeOfNumber("3"));
        System.out.println(NumberPicker.getTypeOfNumber("5"));
    }
}