package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void add() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertEquals(item.getName(), result.getName());
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item);
        tracker.add(item2);
        Item[] expected = tracker.findAll();
        Item[] result = new Item[] {item, item2};
        assertArrayEquals(expected, result);
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item[] expected = tracker.findByName("test1");
        Item[] result = new Item[] {item};
        assertArrayEquals(expected, result);
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertEquals(item.getId(), result.getId());
    }
}