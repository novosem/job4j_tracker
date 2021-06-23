package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {

    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        Arrays.sort(atts, comparator);
        for (Attachment i : atts) {
            System.out.println(i);
        }
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> Integer.compare(right.length(), left.length());
        String[] numbers = {
                "1. Task",
                "11. Task",
                "2. Task"
        };
        Comparator<String> numStr = (left, right) -> {
            int first = Integer.valueOf(left.substring(0, left.indexOf(".")));
            int second = Integer.valueOf(right.substring(0, right.indexOf(".")));
            return first - second;
        };
        Arrays.sort(numbers, numStr);
        for (String s : numbers) {
            System.out.println(s);
        }
        Comparator<Attachment> comparator1 = (left, right) -> {
            System.out.println("compare - " + left.getSize() + " : " + right.getSize());
            return left.getSize() - right.getSize();
        };
        Arrays.sort(atts, comparator1);
        for (Attachment z : atts) {
            System.out.println(z);
        }
    }
}
