package com.greatwideweb.samples.lambdas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddCounterUnitTest {

    private EvenOrOddCounter counter;
    @Test
    public void ensureEvenOddCounterReturnsExpected() {
        counter = new EvenOrOddCounter(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertValues(5, 5);

        counter = new EvenOrOddCounter(1, 9);
        assertValues(0, 2);

        counter = new EvenOrOddCounter(2, 4, 6, 22);
        assertValues(4, 0);
    }

    @Test
    public void ensureNegativeNumbersHaveExpectedResults()
    {
        counter = new EvenOrOddCounter(-1, -7, -4, -3, -4, -8);
        assertValues(3, 3);
    }

    private void assertValues(Integer expectedEvens, Integer expectedOdds) {
        assertEquals(String.valueOf(expectedOdds), counter.getOdds().toString());
        assertEquals(String.valueOf(expectedEvens), counter.getEvens().toString());
    }
}
