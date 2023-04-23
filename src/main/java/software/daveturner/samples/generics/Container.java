package software.daveturner.samples.generics;

import java.util.ArrayList;
import java.util.List;

public class Container <T> {

    private List<T> list = new ArrayList<>();
    public void add(T e) { list.add(e); }
    public int size() { return list.size(); }
    public void remove(T e) { list.remove(e); }

}
