package ru.job4j.collection;

import java.util.HashMap;

public class FreezeStr {

    public static boolean eq(String left, String right) {
        int j = 1;
        boolean rsl = true;
        char[] array = left.toCharArray();
        char[] array1 = right.toCharArray();
        HashMap<Character, Integer> aa = new HashMap<>();
        for (char c : array) {
            aa.computeIfPresent(c, (key, value) -> j + 1);
            aa.putIfAbsent(c, j);
        }
        for (char a : array1) {
            if (!aa.containsKey(a)) {
                rsl = false;
                break;
            } else if (aa.get(a) == 1) {
                aa.remove(a);
            } else {
                aa.replace(a, aa.get(a), aa.get(a) - 1);
            }
        }
        return rsl;
            }
}
