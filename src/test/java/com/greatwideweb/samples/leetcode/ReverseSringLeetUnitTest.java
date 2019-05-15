package com.greatwideweb.samples.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseSringLeetUnitTest {


    @Test
    public void ensureGretaerSizereturnsREverse() {
        ReverseStringLeet o = new ReverseStringLeet();
        Assert.assertEquals("gfedcba", o.reversString3("abcdefg", 10));
    }

    @Test
    public void reverseString() {
        ReverseStringLeet o = new ReverseStringLeet();
        Assert.assertEquals("bacdfeg", o.reversString3("abcdefg", 2));
    }
}
