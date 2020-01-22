package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;


public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(6,2);
        Assert.assertEquals(expected, out,0.01);
    }
}