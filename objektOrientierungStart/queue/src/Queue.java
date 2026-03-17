import java.util.LinkedList;

public class Queue<T> {
    LinkedList<T> list = new LinkedList<>();
    private int size = 0;


    // void enqueue(int newElement): fügt ein neues Element hinten in die Schlange ein
    void enqueue(T newElement) {
        list.add(newElement);
    }

    // int size(): gibt die Anzahl der Elemente in der Queue zurück
    int size() {
        return size;
    }

    // int dequeue(): gibt das erste Element der Schlange zurück und entfernt dieses daraus
    T dequeue() {
        return list.removeFirst();
    }

    // int[] dequeue(int n): gibt die ersten n Elemente der Schlange zurück und entfernt diese daraus
    T[] dequeue(int n) {
        if (size > n)
            throw new RuntimeException("There are only '" + size + "' elements in the list! (Tried t remove '" + n + "' elements.");

        T[] result = (T[]) new Object[n];

        for (int i = 0; i < n; i++) {
            result[i] = list.removeFirst();
        }

        return result;
    }

    @Override
    public String toString() {
        return "Queue = " + list;
    }
}
