package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] a1 = o1.split("/");
        String[] a2 = o2.split("/");
        if (a1.length - a2.length == 0) {
            return o1.compareTo(o2);
        }
        return a1[a1.length - 1].compareTo(a2[a2.length - 1]);
    }
}
