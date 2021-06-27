package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void matrixToList() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        List<Integer> rsl = matrix.stream().flatMap(List :: stream).collect(Collectors.toList());
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(rsl, expect);
    }
}