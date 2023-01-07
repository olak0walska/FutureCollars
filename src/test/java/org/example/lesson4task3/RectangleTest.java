package org.example.lesson4task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateTheAreaOfTheRectangle() {
        Rectangle rectangle = new Rectangle(12, 10);
        double getArea = rectangle.getArea();
        Assertions.assertEquals(120, getArea);
    }

    @Test
    void shouldCalculateThePerimeterOfTheRectangle() {
        Rectangle rectangle = new Rectangle(10, 9);
        double getPerimeter = rectangle.getPerimeter();
        Assertions.assertEquals(38, getPerimeter);
    }
}