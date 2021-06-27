package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrixx {

    public static void main(String[] args) {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> rsl = Arrays.stream(matrix)
                .flatMap(Arrays :: stream)
                .collect(Collectors.toList());
        System.out.println(rsl);
    }

    public List<Integer> matrixToList(Integer[][] matrix) {
        return Stream.of(matrix).flatMap(Arrays :: stream).collect(Collectors.toList());
    }
}
