package org.example.lesson5task1;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkText("kajak"));
        System.out.println(checkText(""));
        System.out.println(checkText("qwerty"));

    }

    public static String checkText(String text) {
        if (isNotEmpty(text)) {
            System.out.println("Text is not empty.");
            System.out.println("Text is a palindrome: " + isPalindrome(text));
            System.out.println("Text length: " + getLength(text));
        } else {
            System.out.println("Text is empty");
        }
        return "";
    }

    private static boolean isNotEmpty(String text) {
        if (text.length() > 0) ;
        return true;
    }

    private static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        return true;
    }

    private static int getLength(String text) {
        return text.length();
    }
}
