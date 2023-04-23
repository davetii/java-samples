package software.daveturner.samples.lambdas;

import java.util.function.Consumer;

public class EvenOrOddCounter {

    private Integer evens=0;
    private Integer odds=0;

    public Integer getEvens() { return evens; }
    public Integer getOdds() { return odds; }

    public EvenOrOddCounter(Integer ... list) {
        Consumer<Integer> c = (i) -> { if (i % 2 == 0) { evens++; } else { odds++; }};
        for (Integer i : list) { c.accept(i); }
    }
}
