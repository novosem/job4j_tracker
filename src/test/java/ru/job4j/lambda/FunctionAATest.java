package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctionAATest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionAA function = new FunctionAA();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuaterFunctionThenQuaterResults() {
        FunctionAA function = new FunctionAA();
        List<Double> result = function.diapason(1, 4, x -> x * x + 1);
        List<Double> expected = Arrays.asList(2D, 5D, 10D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenShownFunctionThenShownResults() {
        FunctionAA function = new FunctionAA();
        List<Double> result = function.diapason(2, 5, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(5D, 9D, 17D);
        assertThat(result, is(expected));
    }
}