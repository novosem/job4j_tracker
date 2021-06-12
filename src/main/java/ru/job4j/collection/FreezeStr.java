package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

    public static boolean eq(String left, String right) {
        int j = 1;
        boolean rsl = false;
        char[] array = left.toCharArray();
        char[] array1 = right.toCharArray();
        HashMap<Character, Integer> aa = new HashMap<>();
        HashMap<Character, Integer> bb = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            aa.computeIfPresent(array[i], (key, value) -> j + 1);
            aa.putIfAbsent(array[i], j);
            bb.computeIfPresent(array1[i], (key, value) -> j + 1);
            bb.putIfAbsent(array1[i], j);
        }
        return bb.equals(aa);
            }
}
