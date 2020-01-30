package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;


public class MinDiapasonTest {

    @Test
    public void firstMin() {
        Assert.assertEquals(0, MinDiapason.findMin(new int[] {-1, 0, 5, 10}, 1, 3));
    }

    @Test
    public void lastMin() {
        Assert.assertEquals(1, MinDiapason.findMin(new int[] {10, 5, 3, 1}, 1, 3));
    }

    @Test
    public void middleMin() {
        Assert.assertEquals(2, MinDiapason.findMin(new int[] {10, 2, 5, 1}, 0, 2));
    }
}