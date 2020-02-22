package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax2() {
        int result = Max.max(1, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void whenMax3() {
        int result = Max.max(3, 1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void whenMax4() {
        int result = Max.max(1, 3, 4, 2);
        Assert.assertEquals(4, result);
    }
}