package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertEquals(new User("Ivan", 31), it.next());
        assertEquals(new User("Petr", 32), it.next());
    }
    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertTrue(rsl > 0);

    }
    @Test
    public void whenEqualNames() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Ivan", 31));
        users.add(new User("Ivan", 20));
        Iterator<User> it = users.iterator();
        assertEquals(new User("Ivan", 31), it.next());
        assertEquals(new User("Ivan", 32), it.next());
    }
}