package com.greatwideweb.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountLettersInStringTest {

    private CountLettersInString o;


    @BeforeEach
    public void setup() {
        o = new CountLettersInString();
    }
    @Test
    public void ensureFirstMostOccurringLetterHandlesNullAndEmpty() {
        assertNull(o.firstMostOccurringLetter(null));
        assertNull(o.firstMostOccurringLetter(""));
        assertNull(o.firstMostOccurringLetter("  "));
    }

    @Test
    public void ensureMostOccurringLetterReturnsExpected() {
        String testString = "I alm aLLl";
        assertEquals("l", o.firstMostOccurringLetter(testString).get(0));
    }

    @Test
    public void ensureMultipleTopOccurrencesReturnExpected() {
        String testString = "I alm maLLl tmhM";
        assertEquals(2, o.firstMostOccurringLetter(testString).size());
        assertTrue(o.firstMostOccurringLetter(testString).contains("m"));
        assertTrue(o.firstMostOccurringLetter(testString).contains("l"));
    }


}
