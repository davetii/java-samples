package com.greatwideweb.samples.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class SinglyLinkedListTest {

    public SinglyLinkedList list;

    @BeforeEach
    public void setup() {
        list = new SinglyLinkedList();
    }

    @Test
    public void ensureInsertDeleteCollectionSize() {
        Assertions.assertEquals(list.isEmpty(), true);
        list.insert("1");
        list.insert(2);
        list.insert(false);
        Map map = new HashMap();
        map.put("key", "value");
        list.insert(map);
        Assertions.assertEquals(list.size(), 4);
        Assertions.assertEquals(list.isEmpty(), false);
        // display for no apparent reason
        list.displayList();
        list.delete();
        list.delete();
        Assertions.assertEquals(list.size(), 2);
        list.delete();
        list.delete();
        Assertions.assertEquals(list.isEmpty(), true);
    }
}
