package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue<Integer> queue;


    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }


    @Test
    void testEnqueueAndSize() {
        assertEquals(0, queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(2, queue.size());
    }

    @Test
    void testDequeueSingle() {
        queue.enqueue(1);
        queue.enqueue(2);
        int removed = queue.dequeue();
        assertEquals(1, removed);
        assertEquals(1, queue.size());
    }

    @Test
    void testDequeueEmptyThrows() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            queue.dequeue();
        });
        assertEquals("Queue is empty!", exception.getMessage());
    }

    @Test
    void testEnqueueAndDequeueMultipleElements() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test
    void testOutOfBounds() {
        queue.enqueue(1);
        Exception exception = assertThrows(RuntimeException.class, () -> queue.dequeue(5));
        assertTrue(exception.getMessage().contains("There are only"));
    }
}