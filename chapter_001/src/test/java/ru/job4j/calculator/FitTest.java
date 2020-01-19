package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;


public class FitTest {

    @Test
    public void manWeight() {
        double in = 183;
        double expected = 95.44;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 164;
        double expected = 62.09;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}