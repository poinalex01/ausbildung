void main() {
    LinkedList<String> list = new LinkedList<>();

    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add(1, "Mango");

    list.printList();

    list.remove(1);

    list.printList();

    System.out.println(list.get(1));
}


    /*
    *   void    add(E e);                  // fügt ein Element ans Ende der Liste hinzu
         void    add(int index, E element); // fügt ein Element an der Position 'index' in die Liste hinzu, sollte das Hinzufügen nicht funktioniert haben, soll eine Exception ausgeworfen werden
         int     size();                    // gibt die Anzahl der Elemente in der Liste aus
         E       get(int index);            // gibt das Element an der Position 'index' aus
         E       remove(int index);         // löscht das Element an der Position 'index' aus der Liste
* */