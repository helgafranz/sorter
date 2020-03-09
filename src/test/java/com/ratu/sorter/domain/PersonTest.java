package com.ratu.sorter.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testShouldReturnPositiveWhenLastNameOfFirstPersonIsBig() {
        Person personOne = new Person("Iddins", "Orson Milka");
        Person personTwo = new Person("Battelle", "Erna Dorey");
        assertTrue(personOne.compareTo(personTwo) > 0);
    }

    @Test
    public void testShouldReturnNegativeWhenLastNameOfFirstPersonIsSmall() {
        Person personOne = new Person("Iddins", "Orson Milka");
        Person personTwo = new Person("Battelle", "Erna Dorey");
        assertTrue(personTwo.compareTo(personOne) < 0);
    }

    @Test
    public void testShouldSortByGivenNameIfLastNameIsSame() {
        Person personOne = new Person("Monaghan", "Leonerd Adda Micheli");
        Person personTwo = new Person("Monaghan", "Leonerd Adda Mitchell");
        assertTrue(personTwo.compareTo(personOne) > 0);
    }

    @Test
    public void testShouldReturnZeroWhenBothNamesAreSame() {
        Person personOne = new Person("Iddins", "Orson Milka");
        Person personTwo = new Person("Iddins", "Orson Milka");
        assertEquals(0, personTwo.compareTo(personOne));
    }
}