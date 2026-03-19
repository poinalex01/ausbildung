package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(3, 4);
    }


    @Test
    void getArea() {
        assertEquals(12, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(14, rectangle.getPerimeter());
    }

    @Test
    void invalidValues() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 4));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(3, -5));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2, -3));

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1, 0));
    }
}