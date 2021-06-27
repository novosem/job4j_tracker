package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Matrix {

    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        System.out.println(matrix.stream().flatMap(List :: stream).collect(Collectors.toList()));
    }

    public List<Integer> matrixToList(List<List<Integer>> matrix) {
        return matrix.stream().flatMap(List :: stream).collect(Collectors.toList());
    }
}
