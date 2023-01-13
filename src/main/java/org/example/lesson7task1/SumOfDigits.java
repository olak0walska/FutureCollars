package org.example.lesson7task1;

public class SumOfDigits {
    public static int sumOfDigits(int number) {
        int sum = 0;
        do {
            int digit = number % 10;
            sum += digit;
            number = (number - digit) / 10;
        }
        while (number != 0);
        return sum;
    }
}