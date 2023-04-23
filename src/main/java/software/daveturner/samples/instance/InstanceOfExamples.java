package software.daveturner.samples.instance;

interface Thing { }
class Andy implements Thing{}
class Bob extends Andy { }

public class InstanceOfExamples {

    public static void main(String[] args) {

        Bob bob = new Bob();
        Andy andy = new Andy();
        Integer i = 5;
        Bob b;
        String notInit;
        String _null = null;
        String s= "test";

        // true
        System.out.println(bob instanceof Bob);
        /* will not compile due to lack of initialization
        System.out.println(notInit instanceof String);
        */
        // will always be false, due to null rule
        System.out.println(_null instanceof String);

        /* will not compile
        System.out.println(s instanceof Integer);
        */
        // true
        System.out.println(s instanceof Object);
        System.out.println(s instanceof String);
        System.out.println(bob instanceof Andy);
        System.out.println(bob instanceof Thing);

        // the rare false situation
        System.out.println(andy instanceof Bob);
    }
}
