import org.example.DoubleLinkedList;

void main() {
    DoubleLinkedList<String> list = new DoubleLinkedList<>();

    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add(1, "Mango");

    System.out.println("list.toString() = " + list);

    System.out.println("list.remove(1) = " + list.remove(1));

    System.out.println("list.toString() = " + list);

    System.out.println("list.get(1) = " + list.get(1));

    System.out.println("list.toStringReverse() = " + list.toStringReverse());
}


    /*
    *   void    add(E e);                  // fügt ein Element ans Ende der Liste hinzu
         void    add(int index, E element); // fügt ein Element an der Position 'index' in die Liste hinzu, sollte das Hinzufügen nicht funktioniert haben, soll eine Exception ausgeworfen werden
         int     size();                    // gibt die Anzahl der Elemente in der Liste aus
         E       get(int index);            // gibt das Element an der Position 'index' aus
         E       remove(int index);         // löscht das Element an der Position 'index' aus der Liste
* */