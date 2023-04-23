package software.daveturner.samples.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumAlgoTest {

    SumAlgo sumAlgo = new SumAlgo();

    @Test
    public void ensure1IntReturnsExpected() {
        Assertions.assertEquals(1, sumAlgo.sum(1));
    }

    @Test
    public void ensure2IntReturnsExpected() {
        Assertions.assertEquals(3, sumAlgo.sum(2));
    }

    @Test
    public void ensure3IntReturnsExpected() {
        Assertions.assertEquals(6, sumAlgo.sum(3));
    }

    @Test
    public void moreNUmbersRetrunExpected() {
        Assertions.assertEquals(15, sumAlgo.sum(5));
    }

    @Test
    public void negatvieNumber() {
        Assertions.assertEquals(0, sumAlgo.sum(-3));
    }
}
