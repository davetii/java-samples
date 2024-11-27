package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void test() {
        TwoSum ts = new TwoSum();
        int[] n = {2,4,4,6,8,10,12};
        int[] result = ts.sum(n, 8);
        assertTrue( stream(result).anyMatch(i -> i == 3));
        assertTrue( stream(result).anyMatch(i -> i == 0));
    }

}