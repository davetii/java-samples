package software.daveturner.samples.algo.ds;

import java.util.ArrayList;
import java.util.List;

public class BasicQueue {

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

    public void insert(Integer value) {
        list.add(value);
    }

    public int size() {
        return list.size();
    }
}
