package com.greatwideweb.samples.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.greatwideweb.samples.enums.EnumSingleton.INSTANCE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumSingeltonUnitTest {


    @Test
    public void ensureNameIsEqualInBothInstances() {
        EnumSingleton s1 = INSTANCE;
        EnumSingleton s2 = INSTANCE;
        s1.setName("Bob");
        assertEquals(s1.getName(), "Bob");
        assertEquals(s2.getName(), "Bob");
    }

}
