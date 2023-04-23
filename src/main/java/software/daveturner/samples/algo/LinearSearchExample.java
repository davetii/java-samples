package software.daveturner.samples.algo;

public class LinearSearchExample {
    public int itemAt(String[] list, String v) {
        int def = -1;
        if(list == null || v ==null) { return def; }
        int counter =0;
        for(String s: list) {
            if(s.equals(v)) {
                return counter;
            }
            counter++;
        }
        return def;
    }

}
