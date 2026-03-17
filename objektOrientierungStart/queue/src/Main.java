/*

Aufgabe 5: Queue

Implementiere einen IntQueue! Eine Queue ist eine Schlange, wie eine Warteschlange, in der immer Elemente in der Reihenfolge abgearbeitet werden wie sie aufgenommen werden - dem 'First in first out' Prinzip. Die Klasse Queue sollte folgende Methoden haben:

    void enqueue(int newElement): fügt ein neues Element hinten in die Schlange ein
    int size(): gibt die Anzahl der Elemente in der Queue zurück
    int dequeue(): gibt das erste Element der Schlange zurück und entfernt dieses daraus
    int[] dequeue(int n): gibt die ersten n Elemente der Schlange zurück und entfernt diese daraus

Leg in der Main Methode eine Queue an und schreib ein paar Beispiel-Verwendungen.

Verwende für die Implementierung deine doppelt verkettete Liste und ihre Methoden aus der letzten Übung!
Abnahmekriterien

    Das Programm funktioniert und entspricht der Angabe
    Die geforderten Methoden sind implementiert
    TN kann erklären, warum es Sinn ergibt seine:ihre Implementierung der doppelt verketteten Liste wiederzuverwenden
    Das Programm entspricht den Clean-Code-Anforderungen
    TN kann seinen:ihren Code erklären

* */



void main() {
/*
    void enqueue(int newElement)
    int size()
    int dequeue():
    int[] dequeue(int n)
*/

    Queue<String> queue = new Queue<>();

    queue.enqueue("Nika");
    queue.enqueue("Alex");
    queue.enqueue("Misha");
    queue.enqueue("Oleg");
    queue.enqueue("Val");

    System.out.println("queue.size() = " + queue.size());

    System.out.println(queue);

    System.out.println("queue.dequeue() = " + queue.dequeue());

    System.out.println(queue);

    System.out.println("queue.dequeue(2) = " + Arrays.toString(queue.dequeue(2)));

    System.out.println(queue);
}
