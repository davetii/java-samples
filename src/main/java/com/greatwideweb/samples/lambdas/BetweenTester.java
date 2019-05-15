package com.greatwideweb.samples.lambdas;

import java.util.function.Predicate;

public class BetweenTester implements Predicate<Integer> {
    private final Predicate<Integer> minTest;
    private final Predicate<Integer> maxTest;

    public BetweenTester(Integer newMin, Integer newMax) {
        minTest = (n) -> n > newMin;
        maxTest = (n) -> n < newMax;
    }

    public boolean test(Integer i) {
        return minTest.and(maxTest).test(i);
    }

}
