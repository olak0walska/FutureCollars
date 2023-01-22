package org.example.lesson10task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {
    public static boolean isUrl(String url) {
        Pattern pattern = Pattern.compile("^(http://)?(www\\.)?.+\\.[a-zA-Z]{2,4}$");
        Matcher matcher = pattern.matcher(url);
        boolean matches = matcher.matches();
        return matches;
    }
}
