package com.greatwideweb.samples.puzzles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeCheckerTest {

    PalindromeChecker checker;

    @Before
    public void setup() {
        checker = new PalindromeChecker();
    }

    @Test
    public void ensureNegativeNumbersAreNotPalindrome() {
        Assert.assertFalse(checker.isPalindrome(-1));
    }

    @Test
    public void testGoodPalindrome() {
        Assert.assertTrue(checker.isPalindrome(121));
       // Assert.assertTrue(checker.isPalindrome(22));
    }

    @Test
    public void testWholeNumber() {
        Assert.assertTrue(checker.isPalindrome(1));
    }

    @Test
    public void testNotPalindrome() {
        Assert.assertFalse(checker.isPalindrome(122));
    }


}
