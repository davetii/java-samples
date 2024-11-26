package software.daveturner.samples.algo;

public class GeometricSequence {

    public static double sum(int[] ar, int r) {
        return ar[0] * (1 - Math.pow(r, ar.length)) / (1 - r) ;
    }

    public static int next(int[] ar, int r) {
        return (int) (ar[0] * Math.pow(r, ar.length));
    }

    public static void main(String[] args) {
        int [] s = {3,12,48,192,768};
        System.out.println(next(s, 4));
    }
}
