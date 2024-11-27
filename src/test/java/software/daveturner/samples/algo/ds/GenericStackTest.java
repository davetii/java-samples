package software.daveturner.samples.algo.ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenericStackTest {

    @Test
    public void ensureNumberStackReturnsExpected() {
        GenericStack<Integer> stack = new GenericStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(stack.peek(), 3);
        Assertions.assertEquals(stack.pop(), 3);
        Assertions.assertEquals(stack.peek(), 2);
        Assertions.assertEquals(stack.pop(), 2);
        Assertions.assertEquals(stack.peek(), 1);
    }

}