package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle c = new Circle(3);


    @Test
    void testValidSquare() {
        assertEquals(28.274333882308138, c.getArea());
        assertEquals(18.84955592153876, c.getPerimeter());
    }

    @Test
    void invalidValues() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }

    @Test
    void testNegativeSideThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-3));
    }
}