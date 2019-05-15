package com.greatwideweb.samples.matchers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailMergeUnitTest {

    private static final String BASE_INPUT = "<<name>> is a <<descr>> for the team ";

    @Test
    public void ensureMatcherReturnsExpected() {
        List<Map<String, String>> data = new ArrayList<>();
        data.add(createMap("Bob", "Guard"));
        data.add(createMap("Joe", "Forward"));
        data.add(createMap("Gary", "Thing"));
        MailMerge merger = new MailMerge(BASE_INPUT, data);
        List<String> results = merger.getResults();
        Assert.assertTrue(results.get(0).contains("Bob"));
        Assert.assertTrue(results.get(0).contains("Guard"));
        Assert.assertTrue(results.get(1).contains("Joe"));
        Assert.assertTrue(results.get(1).contains("Forward"));
        Assert.assertTrue(results.get(2).contains("Gary"));
        Assert.assertTrue(results.get(2).contains("Thing"));
    }

    private Map<String,String> createMap(String name, String descr) {
        Map<String,String> map = new HashMap<>();
        map.put(name, descr);
        return map;
    }
}
