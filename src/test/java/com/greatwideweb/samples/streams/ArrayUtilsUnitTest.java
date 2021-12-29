package com.greatwideweb.samples.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ArrayUtilsUnitTest {

    @Test
    public void ensureDistinctReturnsDistinc() {
        Assertions.assertEquals(3, ArrayUtils.getDistinct(Arrays.asList(
                "Bob", "Joe", "Gary", "Bob", "Joe")).size());
    }

    @Test
    public void ensureFormatPlayerNamesReturnsExpected() {
        List<String> generatedList = ArrayUtils.formatPlayerNamesMapExample(buildListOfMaps());
        List<String> expectedList = buildExpectedResult();
        assertList(generatedList, expectedList, 0);
        assertList(generatedList, expectedList, 1);
        assertList(generatedList, expectedList, 2);
        assertList(generatedList, expectedList, 3);
    }

    private void assertList(List<String> generatedList, List<String> expectedList, int i) {
        Assertions.assertEquals(generatedList.get(i), expectedList.get(i));
    }

    private List<String> buildExpectedResult() {
        List<String> result = new ArrayList<>();
        result.add("Ish Smith, Point Guard");
        result.add("Luke Kennard, Big Guard");
        result.add("Avery Bradly, Big Guard");
        result.add("Tobias Harris, Combo Forward");
        result.add("Andre Drummond, Center");
        return result;
    }

    private List<Map<String,String>> buildListOfMaps() {
        List<Map<String,String>> result = new ArrayList<>();
        result.add(buildPlayer("Ish", "Smith", "Point Guard"));
        result.add(buildPlayer("Luke", "Kennard", "Big Guard"));
        result.add(buildPlayer("Avery", "Bradly", "Big Guard"));
        result.add(buildPlayer("Tobias", "Harris", "Combo Forward"));
        result.add(buildPlayer("Andre", "Drummond", "Center"));
        return result;
    }

    private Map<String,String> buildPlayer(String firstName, String lastName, String position) {
        Map<String,String> m = new HashMap<>();
        m.put("firstName", firstName);
        m.put("lastName", lastName);
        m.put("position", position);
        return m;
    }
}
