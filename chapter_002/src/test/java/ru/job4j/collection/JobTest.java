package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenComparatorByNameAscending() {
        Comparator<Job> cmpName = new JobAscByName();
        int result = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fis bug", 1));
        assertTrue(result > 0);

    }

    @Test
    public void whenComparatorByPriorityAscending() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int result = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fis bug", 1));
        assertTrue(result < 0);

    }

    @Test
    public void whenComparatorByNameDescending() {
        Comparator<Job> cmpName = new JobDescByName();
        int result = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fis bug", 1));
        assertTrue(result < 0);
    }

    @Test
    public void whenComparatorByPriorityDescending() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int result = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fis bug", 1));
        assertTrue(result > 0);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int result = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1));
        assertTrue(result > 0);
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobDescByPriority().thenComparing(new JobDescByName());
        int result = cmpPriorityName.compare(
                new Job("Impl task", 1),
                new Job("Fis bug", 1));
        assertTrue(result < 0);
    }
}