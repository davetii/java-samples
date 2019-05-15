package com.greatwideweb.samples.lambdas;

import java.util.function.Function;

public class Incrementor implements Function<Integer, Integer>{

    private Function<Integer, Integer> impl;

    public Incrementor(Integer ... newIncrements) {
        impl = (x) -> {for (Integer i: newIncrements) {x += i;} return x; };
    }

    public Integer apply(Integer i) { return impl.apply(i); }
}
