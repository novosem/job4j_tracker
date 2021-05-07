package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanse3d() {
        double expected = 2.0;
        Point out = new Point(0,0,0);
        Point in = new Point(0, 2, 0);
        double rsl = out.distanse3d(in);
        assertEquals(rsl, expected, 0.01);
    }

    @Test
    public void distanse3d1() {
        double expected = 5.0;
        Point out = new Point(0,0,0);
        Point in = new Point(3, 4, 0);
        double rsl = out.distanse3d(in);
        assertEquals(rsl, expected, 0.01);
    }
}