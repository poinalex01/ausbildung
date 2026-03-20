package org.example;

import java.util.EmptyStackException;

public class Stack {
    private MyList li = new MyList();


    public void push(double x) {
        li.add(x);
    }

    public double pop() {
        checkIfOutOfBounds();

        return li.remove(li.size() - 1);
    }

    public double peek() {
        checkIfOutOfBounds();

        return li.get(li.size() - 1);
    }

    public int size() {
        return li.size();
    }

    public void clear() {
        li.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < li.size(); i++) {
            sb.append(li.get(i));
            if (i < li.size() - 1) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }

    private void checkIfOutOfBounds() {
        if (li.size() == 0) throw new EmptyStackException();
    }

    public static class MyList {
        /**
         * Internal array to store the elements.
         */
        private double[] data = new double[1];

        /**
         * Tracks the number of stored elements (next available index).
         */
        private int size = 0;


        /**
         * Adds a value to the end of the list.
         *
         * @param v the value to add
         */
        public void add(double v) {
            if (size == data.length) resize();

            data[size] = v;
            size++;
        }

        /**
         * Inserts a value at a specific position in the list.
         * Elements after the position are shifted one place to the right.
         *
         * @param pos the index where the value should be inserted (0-based)
         * @param v   the value to insert
         * @throws IndexOutOfBoundsException if the position is invalid
         */
        public void add(int pos, double v) {
            if (pos < 0 || pos > size) throw new IndexOutOfBoundsException("Invalid index: " + pos);

            if (size == data.length) resize();

            for (int i = size; i > pos; i--) // move right
                data[i] = data[i - 1];

            data[pos] = v;
            size++;
        }

        /**
         * Returns the value at the specified index.
         *
         * @param idx the index of the element to retrieve
         * @return the value at the given index
         * @throws IndexOutOfBoundsException if the index is out of range
         */
        public double get(int idx) {
            if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Ungültiger Index: " + idx);
            return data[idx];
        }

        /**
         * Removes the element at the specified index.
         * Elements after the index are shifted one place to the left.
         *
         * @param idx the index of the element to remove
         * @return the removed value
         * @throws IndexOutOfBoundsException if the index is out of range
         */
        public double remove(int idx) {
            if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Ungültiger Index: " + idx);

            double removed = data[idx];
            for (int i = idx; i < size - 1; i++)
                data[i] = data[i + 1];

            size--;
            return removed;
        }

        /**
         * Returns the current number of elements in the list.
         *
         * @return the size of the list
         */
        public int size() {
            return size;
        }

        /**
         * Removes all elements from the list.
         * The internal array remains but is considered empty.
         */
        public void clear() {
            size = 0;
            // data = new double[size];
        }

        /**
         * Returns a string representation of the list's contents.
         *
         * @return a string with all elements separated by spaces
         */
        public String print() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++)
                sb.append(data[i]).append(" ");
            return sb.toString();
        }

        /*
         * Doubles the size of the internal array when it's full.
         */
        private void resize() {
            double[] newData = new double[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }
}


