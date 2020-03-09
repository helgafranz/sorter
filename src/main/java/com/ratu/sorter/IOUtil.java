package com.ratu.sorter;

import com.ratu.sorter.domain.Person;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IOUtil {

    public void writeSortedListToFileAndConsole(List<Person> people) {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("./sorted-names-list.txt"))) {
            for (Person person : people) {
                System.out.println(person);
                bw.write(person.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> readPeopleFromFile(String path) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.lines().map(name -> generatePerson(name)).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.EMPTY_LIST;
    }

    public Person generatePerson(String name) {
        int index = name.lastIndexOf(" ");
        String lastName = name.substring(index).trim();
        String givenName = name.substring(0, index).trim();
        return new Person(lastName, givenName);
    }

}
