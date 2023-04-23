package software.daveturner.samples.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

   Fibonacci fib;

   @BeforeEach
   public void setup() {
       fib = new Fibonacci();
   }

   @Test
   public void ensureFibonacci0Returns0() {
       Assertions.assertEquals(0, fib.head(0));;
   }

    @Test
    public void ensureFibonacci1Returns1() {
        Assertions.assertEquals(1, fib.head(1));;
    }

    @Test
    public void ensureFibonacci2Returns1() {
        Assertions.assertEquals(1, fib.head(2));;
    }

    @Test
    public void ensureFibonacci3Returns3() {
        Assertions.assertEquals(2, fib.head(3));;
    }

    @Test
    public void ensureFibonacci5Returns5() {
        Assertions.assertEquals(5, fib.head(5));;
    }

    @Test
    public void ensureFibonacci6Returns8() {
        Assertions.assertEquals(8, fib.head(6));;
    }

    @Test
    public void ensureFibonacci7Returns13() {
        Assertions.assertEquals(13, fib.head(7));;
    }
}
