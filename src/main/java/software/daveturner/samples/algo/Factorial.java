package software.daveturner.samples.algo;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0) { return 1; }
        int result = n;
        for(int i = 1; i < n; i++) {
            result *= n-i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(5));
    }
}
