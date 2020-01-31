package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;


public class SortSelectedTest {

    @Test
    public void sort() {
        int[] result = SortSelected.sort(new int[] {3, 4, 1, 2, 5});
        int[] expect = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void sort2() {
        int[] result = SortSelected.sort(new int[] {3, 4, 1});
        int[] expect = new int[] {1, 3, 4};
        Assert.assertArrayEquals(expect, result);
    }
}