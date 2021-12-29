package com.greatwideweb.samples.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecursiveLinearSearchUnitTest {

    RecursiveLinearSearch r;
    int[] numberList = {3, 6, 8, 9, 10, 14, 17};
    String[] list = {"Bob", "Jane", "Matt", "Russ", "Vic"};

    @BeforeEach
    public void setup() {
        r = new RecursiveLinearSearch();
    }

    @Test
    public void ensureValueGreaterThanArrayReturnsNegative() {
        Assertions.assertEquals(-1, r.search(numberList, 0, 232));
        Assertions.assertEquals(-1, r.search(list, 0, "Zebra"));
    }

    @Test
    public void ensureValueLessThanArrayReturnsNegative() {
        Assertions.assertEquals(-1, r.search(numberList, 0, 1));
        Assertions.assertEquals(-1, r.search(list, 0, "Arnie"));
    }

    @Test
    public void ensureValueInRangeButNotInArrayReturnsNegative() {
        Assertions.assertEquals(-1, r.search(numberList, 0, 11));
        Assertions.assertEquals(-1, r.search(list, 0, "Caldwell"));
    }

    @Test
    public void ensureValueFoundReturnsExpectedIndex() {
        Assertions.assertEquals(3, r.search(numberList, 0, 9));
        Assertions.assertEquals(3, r.search(list, 0, "Russ"));
    }
}
