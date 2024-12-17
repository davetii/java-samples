package software.daveturner.samples.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static software.daveturner.samples.algo.SorterUtil.*;

public class SorterUtilUnitTest {

    @Test
    public void ensureExpectedSelectionSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        selectionSort(result);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(5, result[2]);
        assertEquals(12, result[3]);
        assertEquals(19, result[4]);
        assertEquals(26, result[5]);
        assertEquals(43, result[6]);
    }

    @Test
    public void ensureExpectedSelectionSortString() {
        String[] result = new String[] {"e", "d", "m", "t", "m", "b", "k"};
        selectionSort(result);
        assertEquals("b", result[0]);
        assertEquals("d", result[1]);
        assertEquals("e", result[2]);
        assertEquals("k", result[3]);
        assertEquals("m", result[4]);
        assertEquals("m", result[5]);
        assertEquals("t", result[6]);
    }

    @Test
    public void ensureExpectedInsertionSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        insertionSort(result);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(5, result[2]);
        assertEquals(12, result[3]);
        assertEquals(19, result[4]);
        assertEquals(26, result[5]);
        assertEquals(43, result[6]);
    }

    @Test
    public void ensureExpectedInsertionSortString() {
        String[] result = new String[] {"e", "d", "m", "t", "m", "b", "k"};
        insertionSort(result);
        assertEquals("b", result[0]);
        assertEquals("d", result[1]);
        assertEquals("e", result[2]);
        assertEquals("k", result[3]);
        assertEquals("m", result[4]);
        assertEquals("m", result[5]);
        assertEquals("t", result[6]);
    }

    @Test
    public void ensureMergeSortReturnsExpected() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        mergeSort(result);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(5, result[2]);
        assertEquals(12, result[3]);
        assertEquals(19, result[4]);
        assertEquals(26, result[5]);
        assertEquals(43, result[6]);
    }

    @Test
    public void ensureExpectedQuickSortNumeric() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        quickSort(result);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(5, result[2]);
        assertEquals(12, result[3]);
        assertEquals(19, result[4]);
        assertEquals(26, result[5]);
        assertEquals(43, result[6]);
    }

    @Test
    void basicSort() {
        int[] result = new int[] {5,3,19,1,43,12,26};
        System.out.println(Arrays.toString(result));
        SorterUtil.basicSort(result);
        //System.out.println(Arrays.toString(result));
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(5, result[2]);
        assertEquals(12, result[3]);
        assertEquals(19, result[4]);
        assertEquals(26, result[5]);
        assertEquals(43, result[6]);

    }
}
