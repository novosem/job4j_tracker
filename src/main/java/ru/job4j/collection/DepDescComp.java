package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] a1 = o1.split("/");
        String[] a2 = o2.split("/");
        int rsl = a1[0].compareTo(a2[0]);
        if (rsl != 0) {
            return rsl;
        }
        return a1[a1.length - 1].compareTo(a2[a2.length - 1]);
    }
}
