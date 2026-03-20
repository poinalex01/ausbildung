package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;


    @BeforeEach
    void setUp() {
        stack = new Stack();
    }


    @Test
    void testPutAndSize() {
        assertEquals(0, stack.size());
        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.size());
    }

    @Test
    void testPopSingle() {
        stack.push(1);
        stack.push(2);
        double removed = stack.pop();
        assertEquals(2, removed);
        assertEquals(1, stack.size());
    }

    @Test
    void testPushAndPopMultipleElements() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testPeek() {
        stack.push(1);
        assertEquals(1, stack.peek());

        stack.push(2);
        assertEquals(2, stack.peek());

        stack.pop();
        assertEquals(1, stack.peek());
    }

    @Test
    void testClear() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());

        stack.clear();
        assertEquals(0, stack.size());
    }

    @Test
    void testPopEmptyThrows() {
        assertThrows(RuntimeException.class, () -> stack.pop());
    }

    @Test
    void testPeekEmptyThrows() {
        assertThrows(RuntimeException.class, () -> stack.peek());
    }
}