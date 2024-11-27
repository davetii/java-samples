package software.daveturner.samples.algo.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneWayNodeTest {

    OneWayNode head;

    @BeforeEach
    public void setup() {
        head = new OneWayNode(1);
        head.next = new OneWayNode(2);
        head.next.next = new OneWayNode(3);
    }


    @Test
    public void ensureSizeReturnsExpected() {
        assertEquals(OneWayNode.size(head),3);
    }

    @Test
    public void ensureLastReturnsExpected() {
        assertEquals(OneWayNode.last(head).data,3);
    }

    @Test
    public void ensureHasNodeReturnsExpected() {
        assertTrue(OneWayNode.hasNode(head, new OneWayNode(2)));
        assertFalse(OneWayNode.hasNode(head, new OneWayNode(343)));
    }

    @Test
    public void ensureInsertAtEndReturnsExpected() {
        head = OneWayNode.insertAtEnd(head, 22);
        assertEquals(OneWayNode.last(head).data,22);
    }

    @Test
    public void ensureInsertBeforeReturnsExpected() {
        head = OneWayNode.insertBeforeNode(head, 19);
        assertEquals(OneWayNode.size(head),4);
        assertEquals(head.data,19);
    }

    @Test
    public void ensureInsertAfterReturnsExpected() {
        OneWayNode.insertAfter(head.next.next, 54);
        assertEquals(OneWayNode.size(head),4);
        assertEquals(OneWayNode.getIndexOf(head, 54),3);
    }

    @Test
    public void ensureRemoveFrom1stItemReturnsExpected() {
        head = OneWayNode.remove(head, 0);
        assertEquals(OneWayNode.size(head),2);
        assertEquals(0, OneWayNode.getIndexOf(head, 2));
        assertEquals(1, OneWayNode.getIndexOf(head, 3));
    }

    @Test
    public void ensureRemoveFrom2ndItemReturnsExpected() {
        System.out.println(head);
        head = OneWayNode.remove(head, 1);
        System.out.println(head);
        assertEquals(OneWayNode.size(head),2);
        assertEquals(0, OneWayNode.getIndexOf(head, 1));
        assertEquals(1, OneWayNode.getIndexOf(head, 3));
    }

    @Test
    public void ensureRemoveFrom3rdItemReturnsExpected() {
       head = OneWayNode.remove(head, 2);
        assertEquals(OneWayNode.size(head),2);
        assertEquals(0, OneWayNode.getIndexOf(head, 1));
        assertEquals(1, OneWayNode.getIndexOf(head, 2));
    }

    @Test
    public void ensureRemoveFromNotFoundItemReturnsExpected() {
        head = OneWayNode.remove(head, 99);
        assertEquals(OneWayNode.size(head),3);
        assertEquals(0, OneWayNode.getIndexOf(head, 1));
        assertEquals(1, OneWayNode.getIndexOf(head, 2));
        assertEquals(2, OneWayNode.getIndexOf(head, 3));
    }



}
