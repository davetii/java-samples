package com.greatwideweb.samples.algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchUnitTest {

    BinarySearch b;
    int[] numberList = {1,3,5,7,9, 12, 17};
    String[] list = {"Anderson", "Caldwell", "Franks", "Izzo", "Killingsworth", "Osbourne", "Thomas", "Vektor"};

    @Before
    public void setup() {
        b = new BinarySearch();
    }

    @Test
    public void ensureReturnsNegativeWhenValueGreaterThanRange() {
        Assert.assertEquals(-1, b.findIndex(numberList, 24));
        Assert.assertEquals(-1, b.findIndex(list, "Zero"));
    }

    @Test
    public void ensureReturnsNegativeWhenValueInRangeButNotFound() {
        Assert.assertEquals(-1, b.findIndex(numberList, 6));
        Assert.assertEquals(-1, b.findIndex(list, "JOhnson"));
    }

    @Test
    public void ensureReturnsNegativeWhenValueLessThanRangeButNotFound() {
        Assert.assertEquals(-1, b.findIndex(numberList, 0));
        Assert.assertEquals(-1, b.findIndex(list, "aa"));
    }

    @Test
    public void ensureReturnsIndexWhenValueFound() {
        Assert.assertEquals(4, b.findIndex(numberList, 9));
        Assert.assertEquals(4, b.findIndex(list, "Killingsworth"));
    }
}
