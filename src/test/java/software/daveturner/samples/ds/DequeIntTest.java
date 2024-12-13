package software.daveturner.samples.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeIntTest {

    Integer[] numbers = {1,2,3,4,5,6,7};
    SimpleDeque<Integer> deque;

    @BeforeEach
    public void setup() {
        deque = new DequeInt(numbers);
    }

    @Test
    void offerFirst() {
        assertEquals(7, deque.size());
        assertEquals(1, deque.peekFirst());
        deque.offerFirst(0);
        assertEquals(8, deque.size());
        assertEquals(0, deque.peekFirst());
    }

    @Test
    void offerLast() {
        assertEquals(7, deque.size());
        assertEquals(7, deque.peekLast());
        deque.offerLast(8);
        assertEquals(8, deque.size());
        assertEquals(8, deque.peekLast());
    }

    @Test
    void peekFirst() {
        assertEquals(1, deque.peekFirst());
    }

    @Test
    void peekLast() {
        assertEquals(7, deque.peekLast());
    }

    @Test
    void pollFirst() {
        assertEquals(1, deque.pollFirst());
        assertEquals(2, deque.pollFirst());
    }

    @Test
    void pollLast() {
        assertEquals(7, deque.pollLast());
        assertEquals(6, deque.pollLast());
    }

    @Test
    void size() {
        assertEquals(7, deque.size());
    }

    @Test
    void isEmpty() {
        assertFalse(deque.isEmpty());
    }

    @Test
    void clear() {
        assertFalse(deque.isEmpty());
        deque.clear();
        assertTrue(deque.isEmpty());
    }
}