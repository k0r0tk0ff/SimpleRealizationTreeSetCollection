import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /**.
         * Declare  collection of type TreeSet.
         */

        TreeSet<String> myTreeSet = new TreeSet<>();

        /**.
         * Add some equal values.
         */

        myTreeSet.add("asdf");
        myTreeSet.add("asdf");
        myTreeSet.add("bb");
        myTreeSet.add("aaf");
        myTreeSet.add("cc");
        myTreeSet.add("cccccf");

        /**
         * and see that in collection
         * present only one entered value "asdf".
         */

        for (String element : myTreeSet) {
            System.out.println(element);
        }


    }
}
