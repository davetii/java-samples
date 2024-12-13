package software.daveturner.samples.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicQueueTest {


    ArrayList<Integer> list = new ArrayList<>();
    SimpleQueue<Integer> q;

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
        assertEquals(6, list.size());
        assertEquals(list.size(), q.size());
    }

    @Test
    public void ensurePeekReturnsExpected() {
        assertEquals(6, list.size());
        assertEquals(1, q.peek());
        assertEquals(6, list.size());
        assertEquals(6, q.size());
    }

    @Test
    public void ensurePopReturnsExpected() {
        assertEquals(6, list.size());
        assertEquals(1, q.pop());
        assertEquals(2, q.peek());
        assertEquals(5, list.size());
    }

    @Test
    public void insertReturnsExpected() {
        assertEquals(6, list.size());
        q.insert(20);
        assertEquals(7, list.size());
        assertEquals(7, q.size());
    }

}