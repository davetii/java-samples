package com.greatwideweb.samples.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class BaseClassReflector {

    BaseClass b;
    Class c;

    public BaseClassReflector() {
         b = new BaseClass();
         c =  b.getClass();
    }

    public String getConstructorName() { return c.getName(); }

    public String overrideFieldAndInvokeMethod(String method, String field, String newValue, boolean allowAccess) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field f = c.getDeclaredField(field);
        f.setAccessible(allowAccess);
        f.set(b, new String(newValue));
        return invokeMethod(method);
    }

    public String invokeMethod(String method) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (String) c.getDeclaredMethod(method).invoke(b);
    }






}
