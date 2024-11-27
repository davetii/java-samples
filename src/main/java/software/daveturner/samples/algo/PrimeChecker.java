package software.daveturner.samples.algo;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n < 2) { return false ; }
        int top = (int) Math.sqrt(n);
        for (int i = 2; i <= top; i++) {
            if (n % i == 0) { return false; }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(16));
        System.out.println(isPrime(17));
        System.out.println(isPrime(10));
        System.out.println(isPrime(9845));
    }
}
