package software.daveturner.samples.basics;

public class Modulo {

    public static int mod(int x, int y) {
        if (x < y) { return x; }
        while( x >= y) {
            x -= y;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(mod(3, 4 ) + " ==  " + 3 % 4);
        System.out.println(mod(4, 3 ) + " ==  " + 4 % 3);
    }
}
