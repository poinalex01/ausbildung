package org.example;

import org.example.exceptions.InvalidPersonNameException;

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
            throw new InvalidPersonNameException("firstName cannot be null or blank!");
        }

        if (lastName == null || lastName.isBlank()) {
            throw new InvalidPersonNameException("lastName cannot be null or blank!");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
    }

    public Person(String firstName, String lastName) {
        if ((firstName + lastName).matches(".*\\d.*")) {
            throw new InvalidPersonNameException("Name is not allowed to contain digits!");
        }

        if (firstName == null || firstName.isBlank()) {
            throw new InvalidPersonNameException("firstName cannot be null or blank!");
        }

        if (lastName == null || lastName.isBlank()) {
            throw new InvalidPersonNameException("lastName cannot be null or blank!");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Gender gender, Address address, LocalDate dateOfBirth) {
        if (firstName == null || firstName.isBlank()) {
            throw new InvalidPersonNameException("firstName cannot be null or blank!");
        }

        if (lastName == null || lastName.isBlank()) {
            throw new InvalidPersonNameException("lastName cannot be null or blank!");
        }

        if (dateOfBirth != null && dateOfBirth.isAfter(LocalDate.now())) {
            System.out.println("dateOfBirth cannot be in the future!: set to null");
            this.dateOfBirth = null;
        } else {
            this.dateOfBirth = dateOfBirth;
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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
