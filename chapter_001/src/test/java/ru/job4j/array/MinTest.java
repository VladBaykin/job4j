package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void firstMin() {
        // assertThat(Min.findMin(new int[] {0, 5, 10}), is(0));
        Assert.assertEquals(0, Min.findMin(new int[] {0, 5, 10}));
    }

    @Test
    public void lastMin() {
        // assertThat(Min.findMin(new int[] {10, 5, 3}), is(3));
        Assert.assertEquals(3, Min.findMin(new int[] {10, 5, 3}));
    }

    @Test
    public void middleMin() {
       // assertThat(Min.findMin(new int[] {10, 2, 5}), is(2));
        Assert.assertEquals(2, Min.findMin(new int[] {10, 2, 5}));
    }
}