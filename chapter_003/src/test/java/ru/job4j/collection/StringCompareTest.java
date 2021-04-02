package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompareTest {

    @Test
    public void whenStringsAreEqualThenZero () {
        StringCompare string = new StringCompare();
        int result = string.compare(
                "Ivanov",
                "Ivanov"
        );
        assertEquals(0, result);
    }
    @Test
    public void whenLeftLessThanRightResultShouldBeNegative () {
        StringCompare string = new StringCompare();
        int result = string.compare(
                "Ivanov",
                "Ivanova"
        );
        assertTrue(result < 0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive () {
        StringCompare string = new StringCompare();
        int result = string.compare(
                "Petrov",
                "Ivanova"
        );
        assertTrue(result > 0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive(){
        StringCompare string = new StringCompare();
        int result = string.compare(
                "Petrov",
                "Patrov"
        );
        assertTrue(result > 0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative(){
        StringCompare string = new StringCompare();
        int result = string.compare(
                "Patrova",
                "Petrov"
        );
        assertTrue(result < 0);
    }
}