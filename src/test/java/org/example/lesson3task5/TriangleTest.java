package org.example.lesson3task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void isItRectangularTriangle() {
        boolean isItRectangularTriangle = Triangle.isItRectangularTriangle(3, 4, 5);
        Assertions.assertTrue(isItRectangularTriangle);
    }

    @Test
    void isItRectangularTriangle2() {
        boolean isItRectangularTriangle = Triangle.isItRectangularTriangle(3, 5, 5);
        Assertions.assertFalse(isItRectangularTriangle);
    }
}