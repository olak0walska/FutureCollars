package org.example.lesson5task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kajak"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("qwerty"));
    }

    static boolean isPalindrome(String text) {
        if (text.length() > 0) {
            System.out.println(text.length());
        } else {
            return false;
        }

        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        return true;
    }

}
