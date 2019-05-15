package com.greatwideweb.samples.algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinearSearchExampleUnitTest {

    LinearSearchExample o;
    String [] list = {"bob", "andy", "caldwell"};

    @Before
    public void before() {
        o = new LinearSearchExample();
    }
    @Test
    public void ensureSearchReturnsNegativeOneWhenNotFound() {
        Assert.assertEquals(-1, o.itemAt(list, "joe") );
    }

    @Test
    public void ensureSearchReturnsPostiveWhenFound() {
        Assert.assertEquals(1, o.itemAt(list, "andy") );
    }

    @Test
    public void ensureSearchReturnsNegativeWhenInputIsNull() {
        Assert.assertEquals(-1, o.itemAt(null, "andy") );
    }
}
