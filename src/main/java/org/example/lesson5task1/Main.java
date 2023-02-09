package org.example.lesson5task1;

public class Main {
    public static void main(String[] args) {

        checkText("kajak");
        checkText("");
        checkText("qwerty");

    }

    public static void checkText(String text) {
        if (isNotEmpty(text)) {
            System.out.println("Text is not empty.");
            System.out.println("Text is a palindrome: " + isPalindrome(text));
            System.out.println("Text length: " + getLength(text));
        } else {
            System.out.println("Text is empty");
        }
    }

    private static boolean isNotEmpty(String text) {
        return text != null && text.length() > 0;
    }

    private static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static int getLength(String text) {
        return text.length();
    }
}
