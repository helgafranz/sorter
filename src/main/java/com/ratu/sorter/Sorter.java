package com.ratu.sorter;

import com.ratu.sorter.domain.Person;

import java.util.Collections;
import java.util.List;

public class Sorter {

    public static void main(String[] args) {
        IOUtil ioUtil = new IOUtil();
        List<Person> people = ioUtil.readPeopleFromFile(args[0]);
        Collections.sort(people);
        ioUtil.writeSortedListToFileAndConsole(people);
    }

}
