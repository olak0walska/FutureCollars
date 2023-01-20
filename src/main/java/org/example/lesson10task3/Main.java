package org.example.lesson10task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(http://)?(www\\.)?.+\\.[a-zA-Z]{2,4}$");
        Matcher matcherOnet = pattern.matcher("http://onet.pl");
        Matcher matcherMail = pattern.matcher("https://mail.google.com");
        Matcher matcherWiadomosci = pattern.matcher("http://wiadmosci.onet.pl");
        Matcher matcherWWWOnet = pattern.matcher("http://www.onet.pl");

        boolean matchesOnet = matcherOnet.matches();
        System.out.println(matchesOnet);

        boolean matchesMail = matcherMail.matches();
        System.out.println(matchesMail);

        boolean matchesWiadomosci = matcherWiadomosci.matches();
        System.out.println(matchesWiadomosci);

        boolean matchesWWWOnet = matcherWWWOnet.matches();
        System.out.println(matchesWWWOnet);
    }
}
