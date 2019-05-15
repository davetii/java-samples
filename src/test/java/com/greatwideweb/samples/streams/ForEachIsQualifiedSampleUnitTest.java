package com.greatwideweb.samples.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ForEachIsQualifiedSampleUnitTest {

    @Test
    public void ensureForEachIsQualifiedSampleReturnsExpected() {
        ForEachIsQualifiedSample qualifier = new ForEachIsQualifiedSample(80);
        List<IsQualifiedObject> list= buildIsQualiedObjects();
        assertQualified(list, 0);
        qualifier.processList(list);
        assertQualified(list, 3);
    }

    private void assertQualified(List<IsQualifiedObject> list, int expectedIsQualifiedObjects) {
        int isQualifedCount = 0;
        for (IsQualifiedObject item : list) {
            if(item.isQualified()) { isQualifedCount++; }
        }
        Assert.assertEquals(isQualifedCount, expectedIsQualifiedObjects);
    }

    private List<IsQualifiedObject> buildIsQualiedObjects() {
        List<IsQualifiedObject> result = new ArrayList<>();
        result.add(new IsQualifiedObject("Test1", 100));
        result.add(new IsQualifiedObject("Test2", 80));
        result.add(new IsQualifiedObject("Test3", 90));
        result.add(new IsQualifiedObject("Test4", -80));
        result.add(new IsQualifiedObject("Test5", 50));
        return result;
    }

}
