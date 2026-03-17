package org.example;/*
void    add(E e);                  // fügt ein Element ans Ende der Liste hinzu
 void    add(int index, E element); // fügt ein Element an der Position 'index' in die Liste hinzu, sollte das Hinzufügen nicht funktioniert haben, soll eine Exception ausgeworfen werden
 int     size();                    // gibt die Anzahl der Elemente in der Liste aus
 E       get(int index);            // gibt das Element an der Position 'index' aus
 E       remove(int index);         // löscht das Element an der Position 'index' aus der Liste

Zusätzlich:
 String  toString();                // Gibt einen String aus, der die Liste ansprechend darstellt
 String  toStringReverse();         // Gibt einen String aus, der die Liste rückwärts ansprechend darstellt
*/

public class DoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void add(int index, T data) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        Node<T> newNode = new Node<>(data);

        if (index == 0) {
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else if (index == size) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node<T> current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Node<T> previous = current.prev;

            previous.next = newNode;
            newNode.prev = previous;
            newNode.next = current;
            current.prev = newNode;
        }

        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> removedNode;

        if (size == 1) {
            removedNode = head;
            head = null;
            tail = null;
        } else if (index == 0) {
            removedNode = head;
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            removedNode = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<T> current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            removedNode = current;
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        size--;
        return removedNode.data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current;

        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }

        return current.data;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;

        while (current != null) {
            sb.append(current.data);

            if (current.next != null) sb.append(" <-> ");

            current = current.next;
        }

        return sb.toString();
    }

    public String toStringReverse() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = tail;

        while (current != null) {
            sb.append(current.data);

            if (current.prev != null) sb.append(" <-> ");

            current = current.prev;
        }

        return sb.toString();
    }
}