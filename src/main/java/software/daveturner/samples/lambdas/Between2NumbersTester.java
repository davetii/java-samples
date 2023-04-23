package software.daveturner.samples.lambdas;

import java.util.function.Predicate;

public class Between2NumbersTester implements Predicate<Integer> {
    private final Predicate<Integer> minTest;
    private final Predicate<Integer> maxTest;

    public Between2NumbersTester(Integer newMin, Integer newMax) {
        minTest = (n) -> n > newMin;
        maxTest = (n) -> n < newMax;
    }

    public boolean test(Integer i) {
        return minTest.and(maxTest).test(i);
    }

}
