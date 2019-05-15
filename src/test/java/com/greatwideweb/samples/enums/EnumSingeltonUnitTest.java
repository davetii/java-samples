package com.greatwideweb.samples.enums;

import org.junit.Assert;
import org.junit.Test;

import static com.greatwideweb.samples.enums.EnumSingleton.INSTANCE;

public class EnumSingeltonUnitTest {


    @Test
    public void ensureNameIsEqualInBothInstances() {
        EnumSingleton s1 = INSTANCE;
        EnumSingleton s2 = INSTANCE;
        s1.setName("Bob");
        Assert.assertEquals(s1.getName(), "Bob");
        Assert.assertEquals(s2.getName(), "Bob");
    }

}
