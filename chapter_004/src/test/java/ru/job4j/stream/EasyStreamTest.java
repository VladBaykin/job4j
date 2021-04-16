package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EasyStreamTest {

    @Test
    public void whenEmptySource() {
        var result = EasyStream.of(List.of()).collect();
        assertEquals(List.of(), result);
    }

    @Test
    public void whenFilledSource() {
        var result = EasyStream.of(List.of(1, 2, 3)).collect();
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    public void whenFilteredSource() {
        var result = EasyStream.of(List.of(1, 2, 3))
                                .filter(e -> e == 2)
                                .collect();
        assertEquals(List.of(2), result);
    }

    @Test
    public void whenMappedSource() {
        var result = EasyStream.of(List.of(1, 2, 3))
                                .map(e -> e * 2)
                                .collect();
        assertEquals(List.of(2, 4, 6), result);
    }

    @Test
    public void whenFilteredMappedSource() {
        var result = EasyStream.of(List.of(1, 2, 3))
                                .filter(e -> e == 2)
                                .map(e -> e * 2)
                                .collect();
        assertEquals(List.of(4), result);
    }

    @Test
    public void whenMappedFilteredSource() {
        var result = EasyStream.of(List.of(1, 2, 3))
                                .map(e -> e * 2)
                                .filter(e -> e == 2)
                                .collect();
        assertEquals(List.of(2), result);
    }

    @Test
    public void whenMultiFilterSource() {
        var result = EasyStream.of(List.of(1, 2, 3, 4, 5))
                                .filter(e -> e >= 2)
                                .filter(e -> e <= 4)
                                .collect();
        assertEquals(List.of(2, 3, 4), result);
    }
}