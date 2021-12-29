package com.greatwideweb.samples.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class BaseClassReflectorUnitTest {

    BaseClassReflector bcr;
    String ORIGINAL_VALUE  = "Hello World";
    String ORIGINAL_FINAL_FIELD_VALUE = "Final Greeting";
    String GREETING_METHOD = "getGreeting";
    String GREETING_FIELD = "greeting";
    String FINAL_GREETING_STRING = "finalGreetingString";
    String FINAL_GREETING_STRING_METHOD = "getFinalGreetingString";
    String FINAL_GREETING_OBJECT = "finalGreetingObject";
    String FINAL_GREETING_OBJECT_METHOD = "getFinalGreetingObject";
    String NEW_FIELD_VALUE = "I am a new field value";

    @BeforeEach
    public void setup() {
        bcr = new BaseClassReflector();
    }

    @Test
    public void ensureConstructorNameReturnsExpected() {
        Assertions.assertEquals(bcr.getConstructorName(), "com.greatwideweb.samples.reflection.BaseClass");
    }

    @Test
    public void ensureReflectionReturnsExpected() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Assertions.assertEquals(bcr.invokeMethod(GREETING_METHOD), ORIGINAL_VALUE);
    }

    @Test
    public void ensureOverideReturnsExpected() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        assertValues(GREETING_METHOD, GREETING_FIELD, NEW_FIELD_VALUE, true, NEW_FIELD_VALUE);
    }

    // this happens due to String being immutable
    @Test
    public void ensureOverideWithFinalFieldReturnsExpected() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        assertValues(FINAL_GREETING_STRING_METHOD, FINAL_GREETING_STRING, NEW_FIELD_VALUE, true, ORIGINAL_FINAL_FIELD_VALUE);
    }

    // String is immutable but object is not
    @Test
    public void ensureOverideWithFinalObjectReturnsExpected() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        assertValues(FINAL_GREETING_OBJECT_METHOD, FINAL_GREETING_OBJECT, NEW_FIELD_VALUE, true, NEW_FIELD_VALUE);
    }

    @Test
    public void ensureGetOverideGreetingThrowsErrorWhenAccessNotAllowedReturnsExpected() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        Assertions.assertThrows(IllegalAccessException.class, () -> {
            bcr.overrideFieldAndInvokeMethod(GREETING_METHOD, GREETING_FIELD, NEW_FIELD_VALUE, false);
        });
    }

    private void assertValues(String method, String field, String newValue, boolean allowAccess, String expectedValue) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        Assertions.assertEquals(bcr.overrideFieldAndInvokeMethod(method, field, newValue, allowAccess), expectedValue);
    }


}
