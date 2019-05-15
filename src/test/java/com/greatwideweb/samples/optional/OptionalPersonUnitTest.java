package com.greatwideweb.samples.optional;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class OptionalPersonUnitTest {

    OptionalPerson p;
    private final String BOB = "Bob";
    private final String JONES = "Jones";

    @Test
    public void ensureAllNullsReturnExpected() {
        p = new OptionalPerson(null);

        Assert.assertEquals(p.getFirstName().isPresent(), false);
        Assert.assertEquals(p.getLastName().isPresent(), false);
        Assert.assertEquals(p.getAge().isPresent(), false);
    }

    @Test(expected=java.util.NoSuchElementException.class)
    public void ensureNoSuchElementException() {
        p = new OptionalPerson(null);
        Assert.assertEquals(p.getAge().get(), null);
        Assert.assertEquals(p.getFirstName().get(), null);
        Assert.assertEquals(p.getLastName().get(), null);
    }

    @Test(expected=java.util.NoSuchElementException.class)
    public void ensureNoSuchElementException2() {
        p = new OptionalPerson(null);
        Assert.assertEquals(p.getAge().get(), Optional.empty());
        Assert.assertEquals(p.getFirstName().get(), Optional.empty());
        Assert.assertEquals(p.getLastName().get(), Optional.empty());
    }

    @Test
    public void ensureOnlyFirstNameReturnsExpected() {
        p = new OptionalPerson(BOB);

        Assert.assertEquals(p.getFirstName(), Optional.of(BOB));
        Assert.assertEquals(p.getFirstName().get(),BOB);
        Assert.assertEquals(p.getFirstName().isPresent(), true);

        Assert.assertEquals(p.getLastName().isPresent(), false);
        Assert.assertEquals(p.getAge().isPresent(), false);
    }

    @Test
    public void ensureFirstLastReturnsExpected() {
        p = new OptionalPerson(BOB, JONES);
        Assert.assertEquals(p.getFirstName(), Optional.of(BOB));
        Assert.assertEquals(p.getFirstName().get(),BOB);
        Assert.assertEquals(p.getFirstName().isPresent(), true);

        Assert.assertEquals(p.getLastName(), Optional.of(JONES));
        Assert.assertEquals(p.getLastName().get(), JONES);
        Assert.assertEquals(p.getLastName().isPresent(), true);

        Assert.assertEquals(p.getAge().isPresent(), false);
    }

    @Test
    public void ensureFirstLastAgeReturnsExpected() {
        int TWENTY_ONE = 21;
        p = new OptionalPerson(BOB, JONES, TWENTY_ONE);
        Assert.assertEquals(p.getFirstName(), Optional.of(BOB));
        Assert.assertEquals(p.getFirstName().get(),BOB);
        Assert.assertEquals(p.getLastName().isPresent(), true);

        Assert.assertEquals(p.getLastName(), Optional.of(JONES));
        Assert.assertEquals(p.getLastName().get(), JONES);
        Assert.assertEquals(p.getLastName().isPresent(), true);

        Assert.assertEquals(p.getAge(), Optional.of(21));
        Assert.assertEquals(p.getAge().get(), Integer.valueOf(21));
        Assert.assertEquals(p.getAge().isPresent(), true);
    }
}
