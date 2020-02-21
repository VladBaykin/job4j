package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenArea() {
        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(4, 0),
                new Point(0, 3)
        );
        double result = triangle.area();
        assertEquals(result, 6.0, 0.1);
    }

    @Test
    public void whenNoArea() {
        Triangle triangle = new Triangle(
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3)
        );
        double result = triangle.area();
        assertEquals(result, -1.0, 0.1);
    }
}