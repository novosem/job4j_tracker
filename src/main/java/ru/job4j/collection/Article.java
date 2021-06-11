package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {

    public static boolean generateBy(String origin, String line) {
        Set<String> aa = new HashSet<>(Arrays.asList(origin.replaceAll("\\pP",
                "").split(" ")));
        Set<String> bb = new HashSet<>(Arrays.asList(line.replaceAll("\\pP", "").split(" ")));
        aa.retainAll(bb);
        return aa.equals(bb);
    }
}
