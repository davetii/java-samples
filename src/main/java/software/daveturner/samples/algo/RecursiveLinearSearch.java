package software.daveturner.samples.algo;

public class RecursiveLinearSearch {
    public int search(int[] a, int i, int x) {
        if (i > a.length - 1) { return -1; }
        else if (a[i] == x) { return i; }
        return search(a, i+1,x );
    }

    public int search(String[] a, int i, String x) {
        if (i > a.length - 1) { return -1; }
        else if (a[i].compareTo(x) == 0) { return i; }
        return search(a, i+1,x );
    }
}
