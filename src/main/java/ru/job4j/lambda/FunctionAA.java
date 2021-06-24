package ru.job4j.lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class FunctionAA {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        int rsl = 0;
        List<Double> aa = new ArrayList<>();
        for (int i = start; i < end; i++) {
            aa.add(rsl++, func.apply((double) Math.abs(i)));
        }
        return aa;
    }

}
