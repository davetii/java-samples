package software.daveturner.samples.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Optional;

public class OptionalPersonUnitTest {

    OptionalPerson p;
    private final String BOB = "Bob";
    private final String JONES = "Jones";

    @Test
    public void ensureAllNullsReturnExpected() {
        p = new OptionalPerson(null);

        Assertions.assertEquals(p.getFirstName().isPresent(), false);
        Assertions.assertEquals(p.getLastName().isPresent(), false);
        Assertions.assertEquals(p.getAge().isPresent(), false);
    }

    @Test
    public void ensureNoSuchElementException() {
        p = new OptionalPerson(null);
        Assertions.assertThrows(java.util.NoSuchElementException.class, () -> {
            p.getAge().get();
        } );
    }

    @Test
    public void ensureNoSuchElementException2() {
        p = new OptionalPerson(null);
        Assertions.assertThrows(java.util.NoSuchElementException.class, () -> {
            p.getAge().get();
        } );
        Assertions.assertThrows(java.util.NoSuchElementException.class, () -> {
            p.getFirstName().get();
        } );
        Assertions.assertThrows(java.util.NoSuchElementException.class, () -> {
            p.getLastName().get();
        } );
    }

    @Test
    public void ensureOnlyFirstNameReturnsExpected() {
        p = new OptionalPerson(BOB);

        Assertions.assertEquals(p.getFirstName(), Optional.of(BOB));
        Assertions.assertEquals(p.getFirstName().get(),BOB);
        Assertions.assertEquals(p.getFirstName().isPresent(), true);

        Assertions.assertEquals(p.getLastName().isPresent(), false);
        Assertions.assertEquals(p.getAge().isPresent(), false);
    }

    @Test
    public void ensureFirstLastReturnsExpected() {
        p = new OptionalPerson(BOB, JONES);
        Assertions.assertEquals(p.getFirstName(), Optional.of(BOB));
        Assertions.assertEquals(p.getFirstName().get(),BOB);
        Assertions.assertEquals(p.getFirstName().isPresent(), true);

        Assertions.assertEquals(p.getLastName(), Optional.of(JONES));
        Assertions.assertEquals(p.getLastName().get(), JONES);
        Assertions.assertEquals(p.getLastName().isPresent(), true);

        Assertions.assertEquals(p.getAge().isPresent(), false);
    }

    @Test
    public void ensureFirstLastAgeReturnsExpected() {
        int TWENTY_ONE = 21;
        p = new OptionalPerson(BOB, JONES, TWENTY_ONE);
        Assertions.assertEquals(p.getFirstName(), Optional.of(BOB));
        Assertions.assertEquals(p.getFirstName().get(),BOB);
        Assertions.assertEquals(p.getLastName().isPresent(), true);

        Assertions.assertEquals(p.getLastName(), Optional.of(JONES));
        Assertions.assertEquals(p.getLastName().get(), JONES);
        Assertions.assertEquals(p.getLastName().isPresent(), true);

        Assertions.assertEquals(p.getAge(), Optional.of(21));
        Assertions.assertEquals(p.getAge().get(), Integer.valueOf(21));
        Assertions.assertEquals(p.getAge().isPresent(), true);
    }
}
