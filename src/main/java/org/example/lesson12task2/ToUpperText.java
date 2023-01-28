package org.example.lesson12task2;

import java.util.function.Function;

public class ToUpperText {

    public static String getToUpperText (String text){
        Function<String, String> stringToUpperCase = (String s) -> s.toUpperCase();
        String toUpperText = stringToUpperCase.apply(text);
        return toUpperText;
    }
}
