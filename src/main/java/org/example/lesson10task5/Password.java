package org.example.lesson10task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static boolean isPasswordGood(String password) {
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?!.*?(?:23)).{7,}$");
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.matches();
        return matches;
    }
}
