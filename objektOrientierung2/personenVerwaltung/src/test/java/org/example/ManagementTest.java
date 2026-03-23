package org.example;

import org.example.exceptions.InvalidPersonNameException;
import org.example.exceptions.ItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagementTest {
    private Management management;


    @BeforeEach
    void setUp() {
        management = new Management("ManagementName");
    }


    @Test
    void testAddSinglePerson() {
        assertEquals(0, management.getPersonList().size());

        Person person = management.createPerson("Nika", "Kokh");
        assertEquals("Nika Kokh", person.getName());

        assertEquals(1, management.getPersonList().size());
    }

    @Test
    void testAddMultiplePerson() {
        String name;
        assertEquals(0, management.getPersonList().size());

        name = management.createPerson("Nika", "Kokh").getName();
        assertEquals("Nika Kokh", name);

        assertEquals(1, management.getPersonList().size());

        name = management.createPerson("Alexander", "Poinstingl").getName();
        assertEquals("Alexander Poinstingl", name);

        assertEquals(2, management.getPersonList().size());
    }

    @Test
    void testGetPerson() {
        management.createPerson("Nika", "Kokh");
        management.createPerson("Alexander", "Poinstingl");
        assertEquals("Nika Kokh", management.getPerson("Nika Kokh").getName());
        assertEquals("Alexander Poinstingl", management.getPerson("Alexander Poinstingl").getName());
        assertEquals("Nika Kokh", management.getPerson("Nika Kokh").getName());
    }

    @Test
    void testNoPersonsExistFoundItemNotFoundException() {
        assertThrows(ItemNotFoundException.class, () -> {
            management.getPerson("Nika Kokh");
        });
    }

    @Test
    void testPersonsExistFoundItemNotFoundException() {
        assertThrows(ItemNotFoundException.class, () -> {
            management.createPerson("Nika", "Kokh");
            management.createPerson("Alexander", "Poinstingl");
            management.getPerson("Micky Mouse");
        });
    }

    @Test
    void testPersonsFirstnameHasDigitsInvalidPersonNameException() {
        assertThrows(InvalidPersonNameException.class, () -> management.createPerson("Nik4", "Kokh"));
    }

    @Test
    void testPersonsLastnameHasDigitsInvalidPersonNameException() {
        assertThrows(InvalidPersonNameException.class, () -> management.createPerson("Nika", "K0kh"));
    }

    @Test
    void testCreatePersonEmptyNamesInvalidPersonNameException() {
        assertThrows(InvalidPersonNameException.class, () -> management.createPerson("", ""));
    }

    @Test
    void testCreatePersonEmptyFirstNameInvalidPersonNameException() {
        assertThrows(InvalidPersonNameException.class, () -> management.createPerson("", "Kokh"));
    }

    @Test
    void testCreatePersonEmptyLastNameInvalidPersonNameException() {
        assertThrows(InvalidPersonNameException.class, () -> management.createPerson("Nika", ""));
    }

    @Test
    void testCreatePersonLastNameNullInvalidPersonNameException() {
        assertThrows(InvalidPersonNameException.class, () -> management.createPerson("Nika", null));
    }

    @Test
    void testCreatePersonFirstNameNullInvalidPersonNameException() {
        assertThrows(InvalidPersonNameException.class, () -> management.createPerson(null, "Kokh"));
    }
}