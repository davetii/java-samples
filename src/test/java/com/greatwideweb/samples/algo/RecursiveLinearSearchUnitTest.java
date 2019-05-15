package com.greatwideweb.samples.algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecursiveLinearSearchUnitTest {

    RecursiveLinearSearch r;
    int[] numberList = {3, 6, 8, 9, 10, 14, 17};
    String[] list = {"Bob", "Jane", "Matt", "Russ", "Vic"};

    @Before
    public void setup() {
        r = new RecursiveLinearSearch();
    }

    @Test
    public void ensureValueGreaterThanArrayReturnsNegative() {
        Assert.assertEquals(-1, r.search(numberList, 0, 232));
        Assert.assertEquals(-1, r.search(list, 0, "Zebra"));
    }

    @Test
    public void ensureValueLessThanArrayReturnsNegative() {
        Assert.assertEquals(-1, r.search(numberList, 0, 1));
        Assert.assertEquals(-1, r.search(list, 0, "Arnie"));
    }

    @Test
    public void ensureValueInRangeButNotInArrayReturnsNegative() {
        Assert.assertEquals(-1, r.search(numberList, 0, 11));
        Assert.assertEquals(-1, r.search(list, 0, "Caldwell"));
    }

    @Test
    public void ensureValueFoundReturnsExpectedIndex() {
        Assert.assertEquals(3, r.search(numberList, 0, 9));
        Assert.assertEquals(3, r.search(list, 0, "Russ"));
    }
}
