package software.daveturner.samples.puzzles;

public class FizzBuzz {

    public static String calcString(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.calcString(15));
        System.out.println(FizzBuzz.calcString(10));
        System.out.println(FizzBuzz.calcString(9));
        System.out.println(FizzBuzz.calcString(11));

    }


}
