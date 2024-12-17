package software.daveturner.samples.puzzles;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueProcessor {

    /*
    input is a list of integers
    Queue cannot be greater than 5
    remove items from queue as they come in if queue is > 5 say waiting
    return the 1st item in line
     */

    public static String WAITING = "waiting";

    Deque<String> q = new ArrayDeque<>();
    public String handleQueue(String ... entries) {
        for (String s: entries) {
            q.offer(s);
        }
        if(q.size() < 5) { return WAITING; }
        while(q.size() > 5) {
            q.pollFirst();
        }
        return q.peekFirst();
    }

}
