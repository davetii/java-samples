package com.greatwideweb.samples.algo;

import org.junit.Assert;
import org.junit.Test;

import static com.greatwideweb.samples.algo.SorterUtil.SORTER_UTIL;

public class SorterUtilUnitTest {

    @Test
    public void ensureExpectedSelectionSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        SORTER_UTIL.selectionSort(result);
        Assert.assertEquals(result[0], 1);
        Assert.assertEquals(result[1], 3);
        Assert.assertEquals(result[2], 5);
        Assert.assertEquals(result[3], 12);
        Assert.assertEquals(result[4], 19);
        Assert.assertEquals(result[5], 26);
        Assert.assertEquals(result[6], 43);
    }

    @Test
    public void ensureExpectedSelectionSortString() {
        String[] result = new String[] {"e", "d", "m", "t", "m", "b", "k"};
        SORTER_UTIL.selectionSort(result);
        Assert.assertEquals(result[0], "b");
        Assert.assertEquals(result[1], "d");
        Assert.assertEquals(result[2], "e");
        Assert.assertEquals(result[3], "k");
        Assert.assertEquals(result[4], "m");
        Assert.assertEquals(result[5], "m");
        Assert.assertEquals(result[6], "t");
    }

    @Test
    public void ensureExpectedInsertionSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        SORTER_UTIL.insertionSort(result);
        Assert.assertEquals(result[0], 1);
        Assert.assertEquals(result[1], 3);
        Assert.assertEquals(result[2], 5);
        Assert.assertEquals(result[3], 12);
        Assert.assertEquals(result[4], 19);
        Assert.assertEquals(result[5], 26);
        Assert.assertEquals(result[6], 43);
    }

    @Test
    public void ensureExpectedInsertionSortString() {
        String[] result = new String[] {"e", "d", "m", "t", "m", "b", "k"};
        SORTER_UTIL.insertionSort(result);
        Assert.assertEquals(result[0], "b");
        Assert.assertEquals(result[1], "d");
        Assert.assertEquals(result[2], "e");
        Assert.assertEquals(result[3], "k");
        Assert.assertEquals(result[4], "m");
        Assert.assertEquals(result[5], "m");
        Assert.assertEquals(result[6], "t");
    }

    @Test
    public void ensureMergeSortReturnsExpected() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        SORTER_UTIL.mergeSort(result);
        Assert.assertEquals(result[0], 1);
        Assert.assertEquals(result[1], 3);
        Assert.assertEquals(result[2], 5);
        Assert.assertEquals(result[3], 12);
        Assert.assertEquals(result[4], 19);
        Assert.assertEquals(result[5], 26);
        Assert.assertEquals(result[6], 43);
    }

    @Test
    public void ensureExpectedQuickSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        SORTER_UTIL.quickSort(result);
        Assert.assertEquals(result[0], 1);
        Assert.assertEquals(result[1], 3);
        Assert.assertEquals(result[2], 5);
        Assert.assertEquals(result[3], 12);
        Assert.assertEquals(result[4], 19);
        Assert.assertEquals(result[5], 26);
        Assert.assertEquals(result[6], 43);
    }
}
