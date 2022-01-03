package com.greatwideweb.samples.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapsSetArrays {

    //advantage is lookup
    @Test
    public void MapAsArray() {

        Map<Integer, String> list = new HashMap<>();
        list.put(0, "String 0");
        list.put(1, "String 1");
        list.put(2, "String 2");
        list.put(3, "String 3");
        list.put(4, "String 4");

        Assertions.assertEquals(5, list.keySet().size());
        // O(1)
        Assertions.assertEquals("String 3", list.get(3));




    }
}
