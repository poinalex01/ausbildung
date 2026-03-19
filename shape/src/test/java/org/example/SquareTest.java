package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square s = new Square(5);


    @Test
    void testValidSquare() {
        assertEquals(25, s.getArea());
        assertEquals(20, s.getPerimeter());
    }

    @Test
    void invalidValues() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-1));
        assertThrows(IllegalArgumentException.class, () -> new Square(0));
    }

    @Test
    void testNegativeSideThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-3));
    }
}