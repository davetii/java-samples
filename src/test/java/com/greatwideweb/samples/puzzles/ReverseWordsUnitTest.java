package com.greatwideweb.samples.puzzles;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsUnitTest {

    @Test
    public void ensureWordsAreReversed() {
        ReverseWords w = new ReverseWords();
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc",
                w.reverseWords2("Let's take LeetCode contest"));
    }


}
