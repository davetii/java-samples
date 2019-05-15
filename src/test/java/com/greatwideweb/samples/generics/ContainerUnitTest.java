package com.greatwideweb.samples.generics;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class ContainerUnitTest {

    @Test
    public void ensureUntypedAddFunctionsAsExpected() {
        Container c = new Container();
        c.add("Test 1");
        c.add(4);
        c.add(new HashMap<String, String>());
        Assert.assertEquals(3, c.size());

    }

    @Test
    public void ensureTypedAddFunctionsAsExpected() {
        Container<String> c = new Container<>();
        c.add("Test 1");
        c.add("Test 2");
        Assert.assertEquals(2, c.size());
    }
}
