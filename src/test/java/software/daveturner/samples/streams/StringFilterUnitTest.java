package software.daveturner.samples.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFilterUnitTest {

    private StringFilter stringFilter;

    @BeforeEach
    public void setup() {
        stringFilter = new StringFilter("Dave");
    }

    @Test
    public void ensureStringFilterWithNoResultReturnsExpected() {
        assertEquals(stringFilter.filter(new ArrayList<>()).size(), 0);
    }

    @Test
    public void ensureStringFilterWith1ResultReturnsExpected() {
        assertEquals(stringFilter.filter(Arrays.asList("Bob", "Dave", "Joe")).size(), 1);
    }

    @Test
    public void ensureStringFilterWith2ResultReturnsExpected() {
        assertEquals(stringFilter.filter(Arrays.asList("Bob", "Dave", "Joe", "Dave")).size(), 2);
    }

    @Test
    public void ensureSimpleFilterWorksAsExpected() {
        Predicate<String> filterForDave = s -> s.equals("Dave");
        assertEquals(2, Arrays.stream(new String[] {"Bob", "Dave", "Joe", "Dave"})
                .filter(filterForDave)
                .count());
    }

    @Test
    public void ensureFindFirstReturnsExpected() {
        assertEquals("Bob", Arrays.stream(new String[] {"Bob", "Dave", "Joe", "Dave"}).findFirst().get());
    }

    @Test
    public void ensureDistinctReturnsExpected() {
        assertEquals(4, Arrays.stream(new String[] {"Bob", "Gary", "Bob", "Dave", "Joe", "Dave"}).distinct().count());
    }



}
