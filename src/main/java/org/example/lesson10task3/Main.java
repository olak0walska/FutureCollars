package org.example.lesson10task3;

public class Main {

    public static void main(String[] args) {
        System.out.println(Url.isUrl("http://onet.pl"));
        System.out.println(Url.isUrl("https://mail.google.com"));
        System.out.println(Url.isUrl("http://wiadmosci.onet.pl"));
        System.out.println(Url.isUrl("http://www.onet.pl"));
    }
}
