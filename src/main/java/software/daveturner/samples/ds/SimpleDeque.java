package software.daveturner.samples.ds;

public interface SimpleDeque<T> {
    void offerFirst(T element);
    void offerLast(T element);
    T peekFirst();
    T peekLast();
    T pollFirst();
    T pollLast();
    int size();
    boolean isEmpty();
    void clear();
}
