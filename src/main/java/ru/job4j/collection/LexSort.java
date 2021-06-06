package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] lefts = left.split("\\.");
        String[] rights = right.split("\\.");
        int leftNum = Integer.parseInt(lefts[0]);
        int rightNum = Integer.parseInt(rights[0]);
        return Integer.compare(leftNum, rightNum);
    }


}
