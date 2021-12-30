package com.greatwideweb.samples.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StrStrImplTest {

    StrStrImpl strStr;

    @BeforeEach
    public void setup() {
        strStr = new StrStrImpl();
    }
    @Test
    public void ensureStrStrHandlesEmpty() {
        Assertions.assertEquals(0, strStr.strStr("", ""));
        Assertions.assertEquals(0, strStr.strStr(null, null));
        Assertions.assertEquals(0, strStr.strStr("", "a"));
    }

    @Test
    public void ensureStrStrReturnsExpected() {
        Assertions.assertEquals(2, strStr.strStr("hello", "ll"));
    }

    @Test
    public void ensureStrStrReturnsExpectedWhenNtFound() {
        Assertions.assertEquals(-1, strStr.strStr("aaaaa", "bba"));
        Assertions.assertEquals(-1, strStr.strStr("aaa", "aaaa"));
    }
}
