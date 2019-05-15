package com.greatwideweb.samples.generics;

import java.util.ArrayList;
import java.util.List;

public class SingleItemContainer<T> {

    private T t;

    public void setContent(T newT) { t = newT; }
    public T getContent() { return t; }
    public String getTypeName() { return t.getClass().getTypeName(); }
    public List<T> getList() {
        List<T> list = new ArrayList<>();
        if (t != null && list.size() == 0) {
            list.add(t);
        }
        return list;
    }
}