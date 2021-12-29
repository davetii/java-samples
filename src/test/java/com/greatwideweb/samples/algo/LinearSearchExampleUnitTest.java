package com.greatwideweb.samples.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinearSearchExampleUnitTest {

    LinearSearchExample o;
    String [] list = {"bob", "andy", "caldwell"};

    @BeforeEach
    public void before() {
        o = new LinearSearchExample();
    }
    @Test
    public void ensureSearchReturnsNegativeOneWhenNotFound() {
        Assertions.assertEquals(-1, o.itemAt(list, "joe") );
    }

    @Test
    public void ensureSearchReturnsPostiveWhenFound() {
        Assertions.assertEquals(1, o.itemAt(list, "andy") );
    }

    @Test
    public void ensureSearchReturnsNegativeWhenInputIsNull() {
        Assertions.assertEquals(-1, o.itemAt(null, "andy") );
    }
}
