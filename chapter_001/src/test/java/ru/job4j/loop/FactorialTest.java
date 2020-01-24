package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void calculateFactorialForFive() {
        Factorial check = new Factorial();
        int result = check.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void calculateFactorialForZero() {
        Factorial check = new Factorial();
        int result = check.calc(0);
        assertThat(result, is(1));
    }
}