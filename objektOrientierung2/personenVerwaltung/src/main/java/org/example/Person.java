package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Address address;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, Gender gender, Address address) {
        if (firstName == null || firstName.isBlank()) {
            System.out.println("firstName cannot be null or blank!: set to 'UNKNOWN'");
            this.firstName = "UNKNOWN";
        } else {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.isBlank()) {
            System.out.println("lastName cannot be null or blank!: set to 'UNKNOWN'");
            this.lastName = "UNKNOWN";
        } else {
            this.lastName = lastName;
        }

        this.gender = gender;
        this.address = address;
    }

    public Person(String firstName, String lastName) {
        if (firstName == null || firstName.isBlank()) {
            System.out.println("firstName cannot be null or blank!: set to 'UNKNOWN'");
            this.firstName = "UNKNOWN";
        } else {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.isBlank()) {
            System.out.println("lastName cannot be null or blank!: set to 'UNKNOWN'");
            this.lastName = "UNKNOWN";
        } else {
            this.lastName = lastName;
        }
    }

    public Person(String firstName, String lastName, Gender gender, Address address, LocalDate dateOfBirth) {
        if (firstName == null || firstName.isBlank()) {
            System.out.println("firstName cannot be null or blank!: set to 'UNKNOWN'");
            this.firstName = "UNKNOWN";
        } else {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.isBlank()) {
            System.out.println("lastName cannot be null or blank!: set to 'UNKNOWN'");
            this.lastName = "UNKNOWN";
        } else {
            this.lastName = lastName;
        }

        if (dateOfBirth != null && dateOfBirth.isAfter(LocalDate.now())) {
            System.out.println("dateOfBirth cannot be in the future!: set to null");
            this.dateOfBirth = null;
        } else {
            this.dateOfBirth = dateOfBirth;
        }

        this.gender = gender;
        this.address = address;
    }


    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", gender=" + gender + ", address=" + address + '}';
    }

    public boolean equals(Person otherPerson) {
        if (otherPerson == null || getClass() != otherPerson.getClass()) return false;
        return Objects.equals(firstName, otherPerson.firstName) && Objects.equals(lastName, otherPerson.lastName) && gender == otherPerson.gender && Objects.equals(address, otherPerson.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, address);
    }
}
