package ru.job4j.lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class FunctionAA {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> aa = new ArrayList<>();
        for (int i = start; i < end; i++) {
            aa.add(func.apply((double) i));
        }
        return aa;
    }
}
