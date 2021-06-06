package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int j;
        int rsl = 0;
        char[] ch1 = left.toCharArray();
        char[] ch2 = right.toCharArray();
        for (int i = 0; i < Math.min(ch1.length, ch2.length); i++) {
            j = ch1[i] - ch2[i];
            if (j != 0) {
                rsl = j;
                break;
            }
            if (ch1.length != ch2.length) {
                rsl = ch1.length - ch2.length;
            }
        }
            return rsl;
        }

    }