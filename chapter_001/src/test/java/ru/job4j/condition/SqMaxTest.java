package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void firstMaximum() {
        int result = SqMax.max(5, 1, 3, 2);
        assertThat(result, is(5));
    }

    @Test
    public void secondMaximum() {
        int result = SqMax.max(1, 5, 4, 3);
        assertThat(result, is(5));
    }

    @Test
    public void thirdMaximum() {
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void forthMaximum() {
        int result = SqMax.max(1, 4, 3, 5);
        assertThat(result, is(5));
    }
}