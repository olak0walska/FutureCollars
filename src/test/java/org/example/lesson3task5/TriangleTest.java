package org.example.lesson3task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void shouldBeRectangularTriangle() {
        //when
        boolean isItRectangular = Triangle.isRectangular(3, 4, 5);

        //then
        Assertions.assertTrue(isItRectangular);
    }

    @Test
    void shouldNotBeRectangularTriangle() {
        //when
        boolean isItRectangular = Triangle.isRectangular(3, 5, 5);

        //then
        Assertions.assertFalse(isItRectangular);
    }
}