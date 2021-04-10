package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void convert() {
        Integer[][] numbers = {
                {1, 2},
                {3, 4},
        };
        List<Integer> result = Matrix.convert(numbers);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, result);
    }
}