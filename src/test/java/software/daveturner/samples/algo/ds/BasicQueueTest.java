package software.daveturner.samples.algo.ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasicQueueTest {


    ArrayList<Integer> list = new ArrayList<>();
    BasicQueue q;

    @BeforeEach
    public void setup() {
        list.clear();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        q = new BasicQueue(list);
    }

    @Test
    public void ensureSizeReturnsExpected() {
        Assertions.assertEquals(6, list.size());
        Assertions.assertEquals(list.size(), q.size());
    }

    @Test
    public void ensurePeekReturnsExpected() {
        Assertions.assertEquals(6, list.size());
        Assertions.assertEquals(1, q.peek());
        Assertions.assertEquals(6, list.size());
        Assertions.assertEquals(6, q.size());
    }

    @Test
    public void ensurePopReturnsExpected() {
        Assertions.assertEquals(6, list.size());
        Assertions.assertEquals(1, q.pop());
        Assertions.assertEquals(2, q.peek());
        Assertions.assertEquals(5, list.size());
    }

    @Test
    public void insertReturnsExpected() {
        q.insert(20);
        Assertions.assertEquals(7, list.size());
        Assertions.assertEquals(7, q.size());
    }

}