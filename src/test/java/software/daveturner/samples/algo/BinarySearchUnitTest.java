package software.daveturner.samples.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static software.daveturner.samples.algo.BinarySearch.*;

public class BinarySearchUnitTest {

    BinarySearch b;
    int[] numberList = {1,3,5,7,9, 12, 17};
    String[] list = {"Anderson", "Caldwell", "Franks", "Izzo", "Killingsworth", "Osbourne", "Thomas", "Vektor"};

    @BeforeEach
    public void setup() {
        b = new BinarySearch();
    }

    @Test
    public void ensureReturnsNegativeWhenValueGreaterThanRange() {
        assertEquals(-1, b.findIndex(numberList, 24));
        assertEquals(-1, b.findIndex(list, "Zero"));
    }

    @Test
    public void ensureReturnsNegativeWhenValueInRangeButNotFound() {
        assertEquals(-1, b.findIndex(numberList, 6));
        assertEquals(-1, b.findIndex(list, "JOhnson"));
    }

    @Test
    public void ensureReturnsNegativeWhenValueLessThanRangeButNotFound() {
        assertEquals(-1, b.findIndex(numberList, 0));
        assertEquals(-1, b.findIndex(list, "aa"));
    }

    @Test
    public void ensureReturnsIndexWhenValueFound() {
        assertEquals(4, b.findIndex(numberList, 9));
        assertEquals(4, b.findIndex(list, "Killingsworth"));
    }

    @Test
    public void ensureSearchReturnsExpected() {
        assertEquals(5, search(List.of(1,3,5,7,9, 12, 17), 12));
    }

    @Test
    public void ensureFindFirstBooleanReturnsExpected() {
        List<Boolean> bools = new ArrayList<>(List.of(true,true,true,false,false));
        assertEquals(3, findFirstBoolean(bools, false));
    }

    @Test
    public void ensureFindFirstGreaterValueReturnsExpected() {
        assertEquals(4, findFirstGreaterValue(List.of(1,3,5,7,9, 12, 17), 8));
        assertEquals(6, findFirstGreaterValue(List.of(1,3,5,7,9, 12, 17), 15));
        assertEquals(2, findFirstGreaterValue(List.of(1,3,5,7,9, 12, 17), 3));
        assertEquals(1, findFirstGreaterValue(List.of(1,3,5,7,9, 12, 17), 2));
    }

    @Test
    public void ensureFindFirstOccurenceReturnsExpected() {
        assertEquals(4, findFirstOccurence(List.of(1,3,3,5,7,7,9, 12, 17), 7));
        assertEquals(1, findFirstOccurence(List.of(1,3,3,3,3,3,5,7,7,9, 12, 17), 3));
        assertEquals(10, findFirstOccurence(List.of(1,3,3,3,3,3,5,7,7,9, 12,12, 12, 12,  17), 12));
    }

    @Test
    public void ensureFindMinRotatedReturnsExpected() {
        assertEquals(0, findMinRotated(List.of(1,3,3,5,7,7,9, 12, 17)));
        assertEquals(8, findMinRotated(List.of(2,3,3,5,7,7,9, 12, 1)));
        assertEquals(2, findMinRotated(List.of(5,7,1, 2, 3)));
    }
}
