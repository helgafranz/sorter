package com.ratu.sorter.domain;

public class Person implements Comparable {

    private String lastName;
    private String givenName;

    public Person(String lastName, String givenName) {
        this.lastName = lastName;
        this.givenName = givenName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Override
    public String toString() {
        return givenName + " " + lastName;
    }

    @Override
    public int compareTo(Object object) {
        Person person = (Person) object;
        int diff = lastName.compareTo(person.getLastName());
        if (diff == 0) {
            return givenName.compareTo(person.getGivenName());
        }
        return diff;
    }
}
