package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CalcDiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = CalcDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertEquals(expected, result);
    }

    @Test
    public void whenSquareFunction() {
        List<Double> result = CalcDiapason.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertEquals(expected, result);
    }

    @Test
    public void whenExponentialFunction() {
        List<Double> result = CalcDiapason.diapason(2, 5, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(4D, 27D, 256D);
        assertEquals(expected, result);
    }
}