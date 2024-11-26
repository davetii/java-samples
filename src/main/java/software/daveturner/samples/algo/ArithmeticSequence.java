package software.daveturner.samples.algo;

public class ArithmeticSequence {
    public static int sum(int[] set) {
        return ((set[0] + set[set.length - 1]) * set.length) / 2;
    }

    public static void main(String[] args) {
        int [] s = {2,4,6,8};
        System.out.println(sum(s));
    }
}
