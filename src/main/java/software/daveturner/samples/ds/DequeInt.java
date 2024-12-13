package software.daveturner.samples.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DequeInt implements SimpleDeque<Integer>{

    private final List<Integer> list = new ArrayList<>();
    public DequeInt(Integer... numbers) {
        this.list.addAll(Arrays.asList(numbers));
    }

    @Override
    public void offerFirst(Integer element) {
        list.add(0, element);
    }

    @Override
    public void offerLast(Integer element) {
        list.add(element);
    }

    @Override
    public Integer peekFirst() {
        return list.get(0);
    }

    @Override
    public Integer peekLast() {
        return list.get(list.size() - 1);
    }

    @Override
    public Integer pollFirst() {
        return list.remove(0);
    }

    @Override
    public Integer pollLast() {
        return list.remove(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}
