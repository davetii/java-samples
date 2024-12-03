package software.daveturner.samples.algo.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static software.daveturner.samples.algo.ds.OneWayNode.*;

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
        assertEquals(size(head),3);
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
        head = OneWayNode.insertAtHead(head, 19);
        assertEquals(size(head),4);
        assertEquals(head.data,19);
    }

    @Test
    public void ensureInsertAtIndexReturnsExpectedWhenValueisZero() {
        head = insertAtIndex(head, 0, 54);
        assertEquals(size(head),4);
        assertEquals(getIndexOf(head, 54),0);
        assertEquals(getIndexOf(head, 1),1);
        assertEquals(getIndexOf(head, 2),2);
        assertEquals(getIndexOf(head, 3),3);
    }

    @Test
    public void ensureInsertAtIndexReturnsExpectedWhenValueisOne() {
        head = insertAtIndex(head, 1, 54);
        System.out.println(head);
        assertEquals(size(head),4);
        assertEquals(getIndexOf(head, 54),1);
        assertEquals(getIndexOf(head, 1),0);
        assertEquals(getIndexOf(head, 2),2);
        assertEquals(getIndexOf(head, 3),3);
    }

    @Test
    public void ensureInsertAtIndexReturnsExpectedWhenValueis2() {
        head = insertAtIndex(head, 2, 54);
        assertEquals(size(head),4);
        assertEquals(getIndexOf(head, 54),2);
        assertEquals(getIndexOf(head, 1),0);
        assertEquals(getIndexOf(head, 2),1);
        assertEquals(getIndexOf(head, 3),3);
    }

    @Test
    public void ensureInsertAtIndexReturnsExpectedWhenValueis3() {
        head = insertAtIndex(head, 3, 54);
        assertEquals(size(head),4);
        assertEquals(getIndexOf(head, 54),3);
        assertEquals(getIndexOf(head, 1),0);
        assertEquals(getIndexOf(head, 2),1);
        assertEquals(getIndexOf(head, 3),2);
    }

    @Test
    public void ensureRemoveFrom1stItemReturnsExpected() {
        head = OneWayNode.remove(head, 0);
        assertEquals(size(head),2);
        assertEquals(0, getIndexOf(head, 2));
        assertEquals(1, getIndexOf(head, 3));
    }

    @Test
    public void ensureRemoveFrom2ndItemReturnsExpected() {
        System.out.println(head);
        head = OneWayNode.remove(head, 1);
        System.out.println(head);
        assertEquals(size(head),2);
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(1, getIndexOf(head, 3));
    }

    @Test
    public void ensureRemoveFrom3rdItemReturnsExpected() {
       head = OneWayNode.remove(head, 2);
        assertEquals(size(head),2);
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(1, getIndexOf(head, 2));
    }

    @Test
    public void ensureRemoveFromNotFoundItemReturnsExpected() {
        head = OneWayNode.remove(head, 99);
        assertEquals(size(head),3);
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(1, getIndexOf(head, 2));
        assertEquals(2, getIndexOf(head, 3));
    }



}
