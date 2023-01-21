package org.example.lesson7task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringLengthTest {

    @ParameterizedTest
    @MethodSource
    void provideArguments(String input) {
        int actualValue = input.length();
        Assertions.assertEquals(LengthOfString.length(input), actualValue);
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("okno", 4),
                Arguments.of("ola kinga klaudia", 17),
                Arguments.of("ala ma kota", 11)
        );
    }
}