package com.ratu.sorter;

import com.ratu.sorter.domain.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {

    public static void main(String[] args) {
        List<Person> people = readPeopleFromFile(args[0]);
        System.out.println(people);
    }

    public static List<Person> readPeopleFromFile(String path) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.lines().map(name -> generatePerson(name)).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.EMPTY_LIST;
    }

    public static Person generatePerson(String name) {
        int index = name.lastIndexOf(" ");
        String lastName = name.substring(index).trim();
        String givenName = name.substring(0, index).trim();
        return new Person(lastName, givenName);
    }
}
