package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 2, 4);
        double out = a.distance3d(b);
        double expected = 3.74;
        Assert.assertEquals(expected, out, 0.01);
    }
}