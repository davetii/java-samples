package software.daveturner.samples.ds;

import java.util.ArrayList;


public class BasicQueue implements SimpleQueue<Integer>{

    ArrayList<Integer> list;

    public BasicQueue(ArrayList<Integer> list) {
        this.list = list;
    }

    public Integer pop() {
        return this.list.remove(0);
    }
    public Integer peek() {
        return list.get(0);
    }

    @Override
    public void insert(Integer e) {
        list.add(e);
    }

    public int size() {
        return list.size();
    }
}
