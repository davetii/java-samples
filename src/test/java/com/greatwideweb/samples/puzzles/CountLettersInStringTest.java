package com.greatwideweb.samples.puzzles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountLettersInStringTest {

    private CountLettersInString o;


    @Before
    public void setup() {
        o = new CountLettersInString();
    }
    @Test
    public void ensureFirstMostOccurringLetterHandlesNullAndEmpty() {
        Assert.assertNull(o.firstMostOccurringLetter(null));
        Assert.assertNull(o.firstMostOccurringLetter(""));
        Assert.assertNull(o.firstMostOccurringLetter("  "));
    }

    @Test
    public void ensureMostOccurringLetterReturnsExpected() {
        String testString = "I alm aLLl";
        Assert.assertEquals("l", o.firstMostOccurringLetter(testString).get(0));
    }

    @Test
    public void ensureMultipleTopOccurrencesReturnExpected() {
        String testString = "I alm maLLl tmhM";
        Assert.assertEquals(2, o.firstMostOccurringLetter(testString).size());
        Assert.assertTrue(o.firstMostOccurringLetter(testString).contains("m"));
        Assert.assertTrue(o.firstMostOccurringLetter(testString).contains("l"));
    }


}
