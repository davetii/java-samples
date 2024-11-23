package software.daveturner.samples.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

   Fibonacci fib;

   @BeforeEach
   public void setup() {
       fib = new Fibonacci();
   }

   @Test
   public void ensureFibonacci0Returns0() {
       assertEquals(0, fib.fib(0));;
   }

    @Test
    public void ensureFibonacci1Returns1() {
        assertEquals(1, fib.fib(1));;
    }

    @Test
    public void ensureFibonacci2Returns1() {
        assertEquals(1, fib.fib(2));;
    }

    @Test
    public void ensureFibonacci3Returns3() {
        assertEquals(2, fib.fib(3));;
    }

    @Test
    public void ensureFibonacci5Returns5() {
        assertEquals(5, fib.fib(5));;
    }

    @Test
    public void ensureFibonacci6Returns8() {
        assertEquals(8, fib.fib(6));;
    }

    @Test
    public void ensureFibonacci7Returns13() {
        assertEquals(13, fib.fib(7));;
    }
}
