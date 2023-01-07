package org.example.lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCalculateTheAreaOfTheSquare() {
        Square square = new Square(10);
        double getArea = square.getArea();
        Assertions.assertEquals(100, getArea);
    }

    @Test
    void shouldCalculateThePerimeterOfTheSquare() {
        Square square = new Square(15);
        double getPerimeter = square.getPerimeter();
        Assertions.assertEquals(60, getPerimeter);
    }
}
