package software.daveturner.samples.algo;

public class BinarySearch {

    public int findIndex(int[] list, int v) {
        int p=0, r = list.length -1;
        while (p <= r) {
            int q = (int)Math.floor((p + r) / 2);
            if (v < list[q]) { r = q-1; }
            else if (v > list[q]){ p = q+1; }
            else return q;
        }
        return -1;
    }

    public int findIndex(String[] list, String v) {
        int p=0, r = list.length -1;
        while (p <= r) {
            int q = (int)Math.floor((p + r) / 2);
            if (v.compareTo(list[q]) < 0) { r = q-1; }
            else if (v.compareTo(list[q]) > 0){ p = q+1; }
            else return q;
        }
        return -1;
    }
}
