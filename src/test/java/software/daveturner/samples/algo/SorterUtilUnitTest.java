package software.daveturner.samples.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorterUtilUnitTest {

    @Test
    public void ensureExpectedSelectionSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        SorterUtil.SORTER_UTIL.selectionSort(result);
        Assertions.assertEquals(result[0], 1);
        Assertions.assertEquals(result[1], 3);
        Assertions.assertEquals(result[2], 5);
        Assertions.assertEquals(result[3], 12);
        Assertions.assertEquals(result[4], 19);
        Assertions.assertEquals(result[5], 26);
        Assertions.assertEquals(result[6], 43);
    }

    @Test
    public void ensureExpectedSelectionSortString() {
        String[] result = new String[] {"e", "d", "m", "t", "m", "b", "k"};
        SorterUtil.SORTER_UTIL.selectionSort(result);
        Assertions.assertEquals(result[0], "b");
        Assertions.assertEquals(result[1], "d");
        Assertions.assertEquals(result[2], "e");
        Assertions.assertEquals(result[3], "k");
        Assertions.assertEquals(result[4], "m");
        Assertions.assertEquals(result[5], "m");
        Assertions.assertEquals(result[6], "t");
    }

    @Test
    public void ensureExpectedInsertionSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        SorterUtil.SORTER_UTIL.insertionSort(result);
        Assertions.assertEquals(result[0], 1);
        Assertions.assertEquals(result[1], 3);
        Assertions.assertEquals(result[2], 5);
        Assertions.assertEquals(result[3], 12);
        Assertions.assertEquals(result[4], 19);
        Assertions.assertEquals(result[5], 26);
        Assertions.assertEquals(result[6], 43);
    }

    @Test
    public void ensureExpectedInsertionSortString() {
        String[] result = new String[] {"e", "d", "m", "t", "m", "b", "k"};
        SorterUtil.SORTER_UTIL.insertionSort(result);
        Assertions.assertEquals(result[0], "b");
        Assertions.assertEquals(result[1], "d");
        Assertions.assertEquals(result[2], "e");
        Assertions.assertEquals(result[3], "k");
        Assertions.assertEquals(result[4], "m");
        Assertions.assertEquals(result[5], "m");
        Assertions.assertEquals(result[6], "t");
    }

    @Test
    public void ensureMergeSortReturnsExpected() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        SorterUtil.SORTER_UTIL.mergeSort(result);
        Assertions.assertEquals(result[0], 1);
        Assertions.assertEquals(result[1], 3);
        Assertions.assertEquals(result[2], 5);
        Assertions.assertEquals(result[3], 12);
        Assertions.assertEquals(result[4], 19);
        Assertions.assertEquals(result[5], 26);
        Assertions.assertEquals(result[6], 43);
    }

    @Test
    public void ensureExpectedQuickSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        SorterUtil.SORTER_UTIL.quickSort(result);
        Assertions.assertEquals(result[0], 1);
        Assertions.assertEquals(result[1], 3);
        Assertions.assertEquals(result[2], 5);
        Assertions.assertEquals(result[3], 12);
        Assertions.assertEquals(result[4], 19);
        Assertions.assertEquals(result[5], 26);
        Assertions.assertEquals(result[6], 43);
    }
}
