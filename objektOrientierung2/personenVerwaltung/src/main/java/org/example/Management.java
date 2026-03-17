package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Management {
    private List<Person> personList = new ArrayList<>();
    private String name;


    public Management(String name) {
        this.name = name;
    }


    public Person createPerson(Person p) {
        personList.add(p);
        return p;
    }

    // Eine Person die lediglich mit Vornamen und Nachnamen erstellt wird
    public Person createPerson(String firstName, String lastName) {
        Person p = new Person(firstName, lastName);
        personList.add(p);
        return p;
    }

    // Eine Person die mit allen Werten erstellt wird
    public Person createPerson(String firstName, String lastName, Gender gender, Address address) {
        Person p = new Person(firstName, lastName, gender, address);
        personList.add(p);
        return p;
    }

    // Eine Person die mit Vornamen, Nachnamen, Geschlecht und Geburtstdatum erstellt wird
    public Person createPerson(String firstName, String lastName, Gender gender, Address address, LocalDate birthDate) {
        Person p = new Person(firstName, lastName, gender, address, birthDate);
        personList.add(p);
        return p;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    @Override
    public String toString() {
        return "Management{" + "personList=" + personList + ", name='" + name + '\'' + '}';
    }
}
