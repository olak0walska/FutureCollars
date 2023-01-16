package org.example.lesson6task8;

public class PeselValidator {
    public static void validateNumericValues(String pesel) {
        try {
            Long.parseLong(pesel);
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("dozwolone są tylko warości liczbowe");
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException("zła ilość znaków");
        }
    }
}