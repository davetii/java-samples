package software.daveturner.samples.ds;

public interface SimpleQueue<T> {
    T pop();
    T peek();
    void insert(T value);
    int size();
}
