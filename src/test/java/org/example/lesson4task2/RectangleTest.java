package org.example.lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateTheAreaOfTheRectangle() {
        Rectangle rectangle = new Rectangle(4, 5);
        double getArea = rectangle.getArea();
        Assertions.assertEquals(20, getArea);
    }

    @Test
    void shouldCalculateThePerimeterOfRectangle() {
        Rectangle rectangle = new Rectangle(6, 8);
        double getPerimeter = rectangle.getPerimeter();
        Assertions.assertEquals(28, getPerimeter);
    }
}