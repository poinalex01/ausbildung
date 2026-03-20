package org.example;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T newElement) {
        list.addLast(newElement);
    }

    public int size() {
        return list.size();
    }

    public T dequeue() {
        if (list.isEmpty()) throw new RuntimeException("Queue is empty!");
        return list.removeFirst();
    }

    public List<T> dequeue(int n) {
        if (list.size() < n)
            throw new RuntimeException("There are only " + list.size() + " elements in the list! Tried to remove " + n + " elements.");

        List<T> result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            result.add(list.removeFirst());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Queue = " + list;
    }
}