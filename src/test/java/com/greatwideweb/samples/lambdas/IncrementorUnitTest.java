package com.greatwideweb.samples.lambdas;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementorUnitTest {

    private Incrementor incrementor;
    @Test
    public void ensure1IncrementReturnsExpected() {
        incrementor = new Incrementor(1);
        assertResults(2, incrementor.apply(1));
        assertResults(10, incrementor.apply(9));
    }

    @Test
    public void ensureIncrementOf5ReturnsExpected() {
        incrementor = new Incrementor(5);
        assertResults(6, incrementor.apply(1));
        assertResults(10, incrementor.apply(5));
    }

    @Test
    public void ensureIncrementWithNegativesReturnsExpected() {
        incrementor = new Incrementor(-1);
        assertResults(0, incrementor.apply(1));
        assertResults(6, incrementor.apply(7));
    }

    @Test
    public void ensure2IncrementReturnsExpected() {
        incrementor = new Incrementor(1, 1);
        assertResults(3, incrementor.apply(1));
        assertResults(11, incrementor.apply(9));

        incrementor = new Incrementor(5, 7);
        assertResults(13, incrementor.apply(1));
        assertResults(21, incrementor.apply(9));
    }

    @Test
    public void ensure3IncrementReturnsExpected() {
        incrementor = new Incrementor(3, 6, 2);
        assertResults(12, incrementor.apply(1));
        assertResults(14, incrementor.apply(3));

        incrementor = new Incrementor(5, 7, 9);
        assertResults(22, incrementor.apply(1));
        assertResults(30, incrementor.apply(9));
    }

    @Test
    public void ensureOddIncrementReturnsExpected() {
        incrementor = new Incrementor(-3, 20, -2);
        assertResults(16, incrementor.apply(1));
        assertResults(20, incrementor.apply(5));
    }

    @Test
    public void ensureZeroIncrementReturnsExpected() {
        incrementor = new Incrementor(0, 0, 0);
        assertResults(1, incrementor.apply(1));
        assertResults(5, incrementor.apply(5));
    }

    @Test
    public void ensureZeroIncrementWithOtherValueReturnsExpected() {
        incrementor = new Incrementor(0, 1);
        assertResults(2, incrementor.apply(1));
        assertResults(6, incrementor.apply(5));
    }

    private void assertResults(int i, Integer result) {
        assertEquals(Integer.valueOf(i), result);
    }
}
