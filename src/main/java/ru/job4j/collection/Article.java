package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {

    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        Set<String> aa = new HashSet<>(Arrays.asList(origin.replaceAll("\\pP",
                "").split(" ")));
        String[] bb = line.replaceAll("\\pP", "").split(" ");
        for (String s : bb) {
            if (!aa.contains(s)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
