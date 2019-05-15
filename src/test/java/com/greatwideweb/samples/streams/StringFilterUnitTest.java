package com.greatwideweb.samples.streams;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class StringFilterUnitTest {

    private StringFilter stringFilter;

    @Before
    public void setup() {
        stringFilter = new StringFilter("Dave");
    }

    @Test
    public void ensureStringFilterWithNoResultReturnsExpected() {
        Assert.assertEquals(stringFilter.filter(new ArrayList<>()).size(), 0);
    }

    @Test
    public void ensureStringFilterWith1ResultReturnsExpected() {
        Assert.assertEquals(stringFilter.filter(Arrays.asList("Bob", "Dave", "Joe")).size(), 1);
    }

    @Test
    public void ensureStringFilterWith2ResultReturnsExpected() {
        Assert.assertEquals(stringFilter.filter(Arrays.asList("Bob", "Dave", "Joe", "Dave")).size(), 2);
    }

    @Test
    public void ensureSimpleFilterWorksAsExpected() {
        Predicate<String> filterForDave = s -> s.equals("Dave");
        Assert.assertEquals(2, Arrays.stream(new String[] {"Bob", "Dave", "Joe", "Dave"})
                .filter(filterForDave)
                .count());
    }

    @Test
    public void ensureFindFirstReturnsExpected() {
        Assert.assertEquals("Bob", Arrays.stream(new String[] {"Bob", "Dave", "Joe", "Dave"}).findFirst().get());
    }

    @Test
    public void ensureDistinctReturnsExpected() {
        Assert.assertEquals(4, Arrays.stream(new String[] {"Bob", "Gary", "Bob", "Dave", "Joe", "Dave"}).distinct().count());
    }



}
