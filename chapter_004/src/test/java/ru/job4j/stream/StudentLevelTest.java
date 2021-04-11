package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(28, "Masha"));
        input.add(new Student(128, "Pety"));
        List<Student> expected = List.of(
                new Student(128, "Pety"),
                new Student(28, "Masha")
        );
        assertEquals(expected, StudentLevel.levelOf(input, 20));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add( null);
        List<Student> expected = List.of();
        assertEquals(expected, StudentLevel.levelOf(input, 100));
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(28, "Pety"));
        List<Student> expected = List.of(new Student(28, "Pety"));
        assertEquals(expected, StudentLevel.levelOf(input, 10));
    }
}