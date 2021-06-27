package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void matrixToListTest() {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrixx rsl = new Matrixx();
        List<Integer> result = rsl.matrixToList(matrix);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(result, expect);
    }
}