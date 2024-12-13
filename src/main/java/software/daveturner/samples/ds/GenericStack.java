package software.daveturner.samples.ds;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class GenericStack<T> {
    List<T> l = new ArrayList<>();

    public T pop() {
        if (l.isEmpty()) {
            throw new EmptyStackException();
        }
        return l.remove(l.size() -1);
    }

    public T peek() {
        if (l.isEmpty()) {
            throw new EmptyStackException();
        }
        return l.get(l.size() -1);
    }

    public void push(T x) {
        l.add(x);
    }
}
