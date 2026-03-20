package org.example;

import org.example.exceptions.InvalidPersonNameException;
import org.example.exceptions.ItemNotFoundException;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        Person person = null;
        do {
            System.out.println("Enter firstname:");
            String firstname = scanner.nextLine();
            System.out.println("Enter lastname:");
            String lastname = scanner.nextLine();
            try {
                person = new Person(firstname, lastname);
            } catch (InvalidPersonNameException e) {
                System.out.println(e.getMessage());
            }
        } while (person == null);

        System.out.println("SUCCESSFULLY CREATE PERSON " + person);


        Management management = new Management("ManagementName");
        management.createPerson(person);
        System.out.println("management.getPerson(person.getName()) = " + management.getPerson(person.getName()));

        System.out.println("Enter the full name of the person ure searching:");

        try {
            System.out.println(management.getPerson(scanner.nextLine()));
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
    static void main() {
        Administration administration = new Administration();

        administration.add("PV Linz");
        administration.add("PV Codersbay");
        administration.add("PV Magistrat Wien");
        administration.add("PV Linz");

        Management pvLinz = administration.get("PV Linz");
        Management pvCodersbay = administration.get("PV Codersbay");
        Management pvMagistratWien = administration.get("PV Magistrat Wien");

        pvLinz.createPerson("Alexander", "Poinstingl");
        pvLinz.createPerson("Nika", "Kokh");

        pvCodersbay.createPerson(
                "Micky",
                "Mouse",
                Gender.MALE,
                new Address("4020", "Linz", "Mstreet", 10)
        );

        pvMagistratWien.createPerson(
                "Mini",
                "Mouse",
                Gender.FEMALE,
                new Address("4020", "Linz", "Mstreet", 11),
                LocalDate.of(1998, 5, 20)
        );

        pvLinz.createPerson(null, "Test");
        pvLinz.createPerson("Alexander", "");
        pvLinz.createPerson("", "Poinstingl");

        pvCodersbay.createPerson(
                null,
                "Mouse",
                Gender.MALE,
                new Address("4020", "Linz", "Hauptstraße", 10)
        );

        pvCodersbay.createPerson(
                "Micky",
                "",
                Gender.MALE,
                new Address("4020", "Linz", "Hauptstraße", 10)
        );

        pvCodersbay.createPerson(
                "Lisa",
                "Berger",
                Gender.FEMALE,
                new Address("", "Linz", "Bahnhofstraße", -1)
        );

        pvMagistratWien.createPerson(
                "David",
                "Winter",
                Gender.MALE,
                new Address("1010", "Wien", "Ringstraße", 8),
                LocalDate.of(3000, 1, 1)
        );

        pvMagistratWien.createPerson(
                "Sarah",
                "Klein",
                null,
                null
        );

        pvMagistratWien.createPerson(
                "Michael",
                "Gruber",
                null,
                null,
                null
        );

        System.out.println(administration);
    }
     */
}