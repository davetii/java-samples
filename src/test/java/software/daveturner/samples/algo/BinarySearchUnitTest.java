package software.daveturner.samples.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(-1, b.findIndex(numberList, 24));
        Assertions.assertEquals(-1, b.findIndex(list, "Zero"));
    }

    @Test
    public void ensureReturnsNegativeWhenValueInRangeButNotFound() {
        Assertions.assertEquals(-1, b.findIndex(numberList, 6));
        Assertions.assertEquals(-1, b.findIndex(list, "JOhnson"));
    }

    @Test
    public void ensureReturnsNegativeWhenValueLessThanRangeButNotFound() {
        Assertions.assertEquals(-1, b.findIndex(numberList, 0));
        Assertions.assertEquals(-1, b.findIndex(list, "aa"));
    }

    @Test
    public void ensureReturnsIndexWhenValueFound() {
        Assertions.assertEquals(4, b.findIndex(numberList, 9));
        Assertions.assertEquals(4, b.findIndex(list, "Killingsworth"));
    }
}
