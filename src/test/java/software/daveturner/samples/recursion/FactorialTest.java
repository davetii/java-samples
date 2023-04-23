package software.daveturner.samples.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    Factorial f;

    @BeforeEach
    public void setup() {
        f = new Factorial();
    }

    @Test
    public void assertFactorial0Is1() {
        Assertions.assertEquals(f.head(0), 1);
        Assertions.assertEquals(f.tail(0), 1);
    }

    @Test
    public void assertFactorial1Is1() {
        Assertions.assertEquals(f.head(1), 1);
        Assertions.assertEquals(f.tail(1), 1);
    }

    @Test
    public void assertFactorial2Is2() {
        Assertions.assertEquals(f.head(2), 2);
        Assertions.assertEquals(f.tail(2), 2);
    }

    @Test
    public void assertFactorial3Is6() {
        Assertions.assertEquals(f.head(3), 6);
        Assertions.assertEquals(f.tail(3), 6);
    }

    @Test
    public void assertFactorial5Is120() {
        Assertions.assertEquals(f.head(5), 120);
        Assertions.assertEquals(f.tail(5), 120);
    }

    @Test
    public void assertFactorial9Is362880() {
        Assertions.assertEquals(f.head(9), 362880);
        Assertions.assertEquals(f.tail(9), 362880);
    }

    @Test
    public void assertFactorial12Is479001600() {
        Assertions.assertEquals(f.head(12), 479001600);
        Assertions.assertEquals(f.tail(12), 479001600);
    }
}
