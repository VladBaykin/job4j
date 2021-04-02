package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void findByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", ""));
        ArrayList<Person> persons = phones.find("Petr");
        assertEquals("Arsentev", persons.get(0).getSurname());
    }
}