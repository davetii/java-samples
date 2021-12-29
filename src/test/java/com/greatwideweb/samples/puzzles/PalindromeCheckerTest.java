package com.greatwideweb.samples.puzzles;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    PalindromeChecker checker  = new PalindromeChecker();

    @Test
    public void ensureNegativeNumbersAreNotPalindrome() {
        assertFalse(checker.isPalindrome(-1));
    }

    @Test
    public void testWholeNumber() {
        assertEquals(true, checker.isPalindrome(1));
    }


    @Test
    public void testGoodPalindrome() {
        assertTrue(checker.isPalindrome(121));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(checker.isPalindrome(122));
    }
}
