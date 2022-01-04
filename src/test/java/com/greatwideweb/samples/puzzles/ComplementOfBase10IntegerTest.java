package com.greatwideweb.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComplementOfBase10IntegerTest {

    ComplementOfBase10Integer o;

    @BeforeEach
    public void setup() {
        o = new ComplementOfBase10Integer();
    }

    /*
    Input: n = 5
    Output: 2
    Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
    Example 2:
     */

    @Test
    public void ensure5ComplementIs2() {
        Assertions.assertEquals(2, o.bitwiseComplement(5));
    }

    @Test
    public void ensure7ComplementIs0() {
        Assertions.assertEquals(0, o.bitwiseComplement(7));
    }

    @Test
    public void ensure10ComplementIs5() {
        Assertions.assertEquals(5, o.bitwiseComplement(10));
    }
}
