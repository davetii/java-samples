package software.daveturner.samples.dynaprog;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    Map<Integer, Integer> m = new HashMap<>();
    int recurseCounter = 0;
    int memoCount = 0;
    int tabCount = 0;

    public int fibMemo(int n) {
        if(m.containsKey(n)) { return m.get(n); }
        memoCount++;
        if(n == 0) { return 0; }
        if(n == 1) { return 1; }
        m.put( n, fibMemo(n -1) +  fibMemo(n -2));
        return m.get(n);
    }

    public int fibRecursive(int n) {
        recurseCounter++;
        if(n == 0) { return 0; }
        if(n == 1) { return 1; }
        return fibRecursive(n -1) +  fibRecursive(n -2);
    }

    public int fibTab(int n) {
        tabCount++;
        int curr, prev, beforePrev = 0;
        beforePrev = 0;
        prev = 1;

        for (int i =2; i < n +1; i++) {
            curr = prev + beforePrev;
            beforePrev = prev;
            prev = curr;
            tabCount++;
        }
        return prev;
    }

    public void calcFib(int n) {
        recurseCounter = 0;
        memoCount = 0;
        tabCount = 0;
        int recurseResult = fibRecursive(n);
        int memoResult = fibMemo(n);
        int tabResult = fibTab(n);
        if(recurseResult != memoResult) {
            System.out.println(" housten we have a problem! recurseCounter: " + recurseCounter + " memoResult: " + memoResult);
        } else if (tabResult != memoResult) {
            System.out.println(" housten we have a problem with tabResult" + tabResult + " memoResult: " + memoResult);
        } else {
            System.out.println("result: " + recurseResult);
            System.out.println("recurseCounter: " + recurseCounter);
            System.out.println("memoCount: " + memoCount);
            System.out.println("tabCount: " + tabCount);
        }
    }

    public static void main(String[] args) {

        Fibonacci o = new Fibonacci();
        o.calcFib(3);
    }
}
