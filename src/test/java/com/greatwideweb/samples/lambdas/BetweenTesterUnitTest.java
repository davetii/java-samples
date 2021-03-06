package com.greatwideweb.samples.lambdas;

import org.junit.Test;
import static org.junit.Assert.*;

public class BetweenTesterUnitTest {

    @Test
    public void ensureBetweenTestReturnsExpected(){
        BetweenTester isBetween = new BetweenTester(2, 7);
        assertTrue(isBetween.test(3));
        assertTrue(isBetween.test(4));
        assertTrue(isBetween.test(5));
        assertTrue(isBetween.test(6));

        assertFalse(isBetween.test(1));
        assertFalse(isBetween.test(2));
        assertFalse(isBetween.test(7));
        assertFalse(isBetween.test(8));
        assertFalse(isBetween.test(100));
    }
}
