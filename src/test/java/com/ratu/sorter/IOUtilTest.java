package com.ratu.sorter;


import com.ratu.sorter.domain.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IOUtilTest {

    private IOUtil ioUtil = new IOUtil();

    @Test
    public void testShouldReturnPerson() {
        Person person = ioUtil.generatePerson("given name last");
        assertEquals("given name", person.getGivenName());
        assertEquals("last", person.getLastName());
    }


    @Test
    public void testShouldReadNamesFromFileAndReturnListOfPerson() {
        List<Person> actualPeople = ioUtil.readPeopleFromFile("./test-names-list.txt");
        List<Person> expectedPeople = new ArrayList<>();
        expectedPeople.add(new Person("Iddins", "Orson Milka"));
        expectedPeople.add(new Person("Battelle", "Erna Dorey"));
        expectedPeople.add(new Person("Franzel", "Flori Chaunce"));

        assertEquals(0, expectedPeople.toString().compareTo(actualPeople.toString()));
    }

    @Test
    public void testShouldWriteToFile() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Iddins", "Orson Milka"));
        people.add(new Person("Battelle", "Erna Dorey"));

        ioUtil.writeSortedListToFileAndConsole(people);

        List<Person> actualPeople = ioUtil.readPeopleFromFile("./sorted-names-list.txt");
        assertEquals(0, people.toString().compareTo(actualPeople.toString()));
    }

}
