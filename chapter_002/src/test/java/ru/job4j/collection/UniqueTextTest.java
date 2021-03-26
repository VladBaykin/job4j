package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueTextTest {

    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse and milk";
        String duplicate = "My cat eats milk and a mouse";
        assertTrue(UniqueText.isEquals(origin, duplicate));
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String duplicate = "A mouse is eaten by a cat";
        assertFalse(UniqueText.isEquals(origin, duplicate));
    }
}