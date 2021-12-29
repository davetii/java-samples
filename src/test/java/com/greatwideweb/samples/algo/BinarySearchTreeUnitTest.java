package com.greatwideweb.samples.algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeUnitTest {

    BinarySearchTree bst;

    @Before
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
        Assert.assertEquals(bst.remove(15), true);
    }

    @Test
    public void ensureRemoveNodeReturnsFalseWhenKeyIsNotFound() {
        Assert.assertEquals(bst.remove(37), false);
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
        Assert.assertEquals(bst.findMax().key, expectedValue);
    }

    private void assertMin(int expectedValue) {
        Assert.assertEquals(bst.findMin().key, expectedValue);
    }
}

