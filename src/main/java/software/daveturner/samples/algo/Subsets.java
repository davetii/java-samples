package software.daveturner.samples.algo;

import java.util.Set;

public class Subsets {

    public static void main(String[] args) {

        System.out.println("s: " + subsets(Set.of(2, 4, 6)));
        System.out.println("s: " + subsets(Set.of("man", "bear", "pig", "manbearpig")));
        System.out.println("s: " + subsets(Set.of(2, 4, 6, 8, 9, 10, 11, 12, 13)));
    }

    private static int subsets(Set<?> s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        return (int) Math.pow(2, s.size());
    }
}
