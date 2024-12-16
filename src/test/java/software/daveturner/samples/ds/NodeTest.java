package software.daveturner.samples.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static software.daveturner.samples.ds.Node.*;

class NodeTest {

    Node head;

    @BeforeEach
    public void setup() {
        head = new Node(1, new Node(2, new Node(3)));
    }

    @Test
    public void ensureLoopPrintsExpected() { loop(head); }

    @Test
    public void ensureToListReturnsExpected() {
        assertEquals(3, toList(head).size());
        assertEquals(1, toList(head).get(0));
        assertEquals(2, toList(head).get(1));
        assertEquals(3, toList(head).get(2));
    }



    @Test
    public void ensureSizeReturnsExpected() {
        assertEquals(3, size(head));
    }

    @Test
    public void ensureSumReturnsExpected() {
        assertEquals(6, sum(head));
    }

    @Test
    public void ensureSumRecursiveReturnsExpected() {
        assertEquals(6, sumRecursive(head));
    }

    @Test
    public void ensureLastReturnsExpected() {
        assertEquals(3, last(head).data);
    }

    @Test
    public void ensureHasNodeReturnsExpected() {
        assertTrue(hasNode(head, new Node(2)));
        assertFalse(hasNode(head, new Node(343)));
    }

    @Test
    public void ensureInsertAtEndReturnsExpected() {
        assertEquals(3, size(head));
        insertAtEnd(head, 22);
        assertEquals(4, size(head));
        assertEquals(22, last(head).data);
    }

    @Test
    public void ensureInsertBeforeReturnsExpected() {
        head = insertAtHead(head, 19);
        assertEquals(4, size(head));
        assertEquals(19, head.data);
    }

    @Test
    public void ensureInsertAtIndexReturnsExpectedWhenValueisZero() {
        head = insertAtIndex(head, 0, 54);
        assertEquals(4, size(head));
        assertEquals(0, getIndexOf(head, 54));
        assertEquals(1, getIndexOf(head, 1));
        assertEquals(2, getIndexOf(head, 2));
        assertEquals(3, getIndexOf(head, 3));
    }

    @Test
    public void ensureInsertAtIndexReturnsExpectedWhenValueisOne() {
        head = insertAtIndex(head, 1, 54);
        assertEquals(4, size(head));
        assertEquals(1, getIndexOf(head, 54));
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(2, getIndexOf(head, 2));
        assertEquals(3, getIndexOf(head, 3));
    }

    @Test
    public void ensureInsertAtIndexReturnsExpectedWhenValueis2() {
        head = insertAtIndex(head, 2, 54);
        assertEquals(4, size(head));
        assertEquals(2, getIndexOf(head, 54));
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(1, getIndexOf(head, 2));
        assertEquals(3, getIndexOf(head, 3));
    }

    @Test
    public void ensureInsertAtIndexReturnsExpectedWhenValueis3() {
        head = insertAtIndex(head, 3, 54);
        assertEquals(4, size(head));
        assertEquals(3, getIndexOf(head, 54));
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(1, getIndexOf(head, 2));
        assertEquals(2, getIndexOf(head, 3));
    }

    @Test
    public void ensureRemoveFrom1stItemReturnsExpected() {
        head = remove(head, 0);
        assertEquals(2, size(head));
        assertEquals(0, getIndexOf(head, 2));
        assertEquals(1, getIndexOf(head, 3));
    }

    @Test
    public void ensureRemoveFrom2ndItemReturnsExpected() {
        System.out.println(head);
        head = remove(head, 1);
        System.out.println(head);
        assertEquals(2, size(head));
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(1, getIndexOf(head, 3));
    }

    @Test
    public void ensureRemoveFrom3rdItemReturnsExpected() {
       head = remove(head, 2);
        assertEquals(2, size(head));
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(1, getIndexOf(head, 2));
    }

    @Test
    public void ensureRemoveFromNotFoundItemReturnsExpected() {
        head = remove(head, 99);
        assertEquals(3, size(head));
        assertEquals(0, getIndexOf(head, 1));
        assertEquals(1, getIndexOf(head, 2));
        assertEquals(2, getIndexOf(head, 3));
    }

    @Test
    public void ensureReverseReturnsExpected() {
        head = reverse(head);
        assertEquals(3, size(head));
        assertEquals(0, getIndexOf(head, 3));
        assertEquals(1, getIndexOf(head, 2));
        assertEquals(2, getIndexOf(head, 1));
    }

    @Test
    public void ensureZipListsReturnsExpected() {
        Node list1 = new Node(1, new Node(15, new Node(19, new Node(23))));
        Node list2 = new Node(4, new Node(10, new Node(12)));
        Node n = Node.zipLists(list1, list2);
        assertEquals(0, Node.getIndexOf(n, 1));
        assertEquals(1, Node.getIndexOf(n, 4));
        assertEquals(2, Node.getIndexOf(n, 15));
        assertEquals(3, Node.getIndexOf(n, 10));
        assertEquals(4, Node.getIndexOf(n, 19));
        assertEquals(5, Node.getIndexOf(n, 12));
        assertEquals(6, Node.getIndexOf(n, 23));
        assertEquals(7, Node.size(n));
    }



}
