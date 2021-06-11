package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

    public static boolean eq(String left, String right) {
        char[] array = left.toCharArray();
        char[] array1 = right.toCharArray();
        HashMap<Character, Integer> aa = new HashMap<>();
        HashMap<Character, Integer> bb = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            aa.put(array[i], i);
            bb.put(array1[i], i);
        }
        HashMap<Character, Integer> cc = new HashMap<>();
        for (char a : aa.keySet()) {
            cc.computeIfPresent(a, (key, value) -> );
            return true;
        }
        return false;
    }
}
