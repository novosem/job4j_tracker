package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.greaterThan;

public class DepDescCompTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void compare1() {
        int rsl = new DepDescComp().compare(
                "k1/sk1/ssk2",
                "k2/sk1/ssk2"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void compareEqual() {
        int rsl = new DepDescComp().compare(
                "k1",
                "k1"
        );
        assertEquals(rsl, 0);
    }

}