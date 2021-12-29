package com.greatwideweb.samples.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SingleContainerUnitTest {

    private String testString = "Test String";
    private Integer testInteger = 4;
    private Double testDouble = 4d;
    @Test
    public void ensureTypesReturnAsExpected() {
        SingleItemContainer<String> container = new SingleItemContainer<>();
        container.setContent(testString);
        assertEquals(testString, container.getContent());
    }

    @Test
    public void ensureListReturnAsExpected() {
        SingleItemContainer<String> container = new SingleItemContainer<>();
        container.setContent(testString);
        assertEquals(1, container.getList().size());
    }

    @Test
    public void ensureTypeNameReturnAsExpected() {
        SingleItemContainer<String> container = new SingleItemContainer<>();
        container.setContent(testString);
        assertEquals("java.lang.String", container.getTypeName());
    }

    @Test
    public void ensureNumberReturnsExpected() {
        SingleItemContainer<Number> container = new SingleItemContainer<>();
        container.setContent(testInteger);
        assertEquals(testInteger, container.getContent());
        assertEquals(Integer.class.getTypeName(), container.getTypeName());
    }

    @Test
    public void ensureNumberAsDoubleReturnsExpected() {
        SingleItemContainer<Number> container = new SingleItemContainer<>();
        container.setContent(testDouble);
        assertEquals(testDouble, container.getContent());
        assertEquals(Double.class.getTypeName(), container.getTypeName());
    }

    @Test
    public void ensureNumberTypeFunctionsAsExpected() {
        SingleItemContainer<Number> container = new SingleItemContainer<>();
        container.setContent(testInteger);
        assertEquals(testInteger, container.getContent());
        assertEquals(testInteger, container.getList().get(0));
        assertEquals(Integer.class.getTypeName(), container.getTypeName());

        container.setContent(testDouble);
        assertEquals(testDouble, container.getContent());
        assertEquals(testDouble, container.getList().get(0));
        assertEquals(Double.class.getTypeName(), container.getTypeName());
    }
}
