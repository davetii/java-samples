package com.greatwideweb.samples.collections;

import com.greatwideweb.samples.collections.BinarySearchTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeUnitTest {

    BinarySearchTree bst;

    @BeforeEach
    public void setup() {
        bst = new BinarySearchTree();
        bst.insert(10, "Ten");
        bst.insert(40, "Forty");
        bst.insert(15, "Fifteen");
        bst.insert(20, "Twenty");
    }

    @Test
    public void ensureEmptyBinarySearchTreeInitCorrectly() {
        BinarySearchTree newBinarySearchTree = new BinarySearchTree();
        newBinarySearchTree.insert(0, "thing");
    }

    @Test
    public void ensureFindMaxReturnsExpected() {
        assertMax(40);
    }

    @Test
    public void ensureFindMinReturnsExpected() {
        assertMin(10);
    }

    @Test
    public void ensureRemoveNodeReturnsTrueWhenKeyIsRemoved() {
        Assertions.assertEquals(bst.remove(15), true);
    }

    @Test
    public void ensureRemoveNodeReturnsFalseWhenKeyIsNotFound() {
        Assertions.assertEquals(bst.remove(37), false);
    }

    @Test
    public void ensureRemoveNodeReturnsExpectedMaxWhenRemovingMax() {
        bst.remove(40);
        assertMax(20);
    }

    @Test
    public void ensureRemoveNodeReturnsExpectedMinWhenRemovingMin() {
        bst.remove(10);
        assertMin(15);
    }

    private void assertMax(int expectedValue) {
        Assertions.assertEquals(bst.findMax().key, expectedValue);
    }

    private void assertMin(int expectedValue) {
        Assertions.assertEquals(bst.findMin().key, expectedValue);
    }
}

