import java.util.Arrays;

public class printer {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourh")
        // ...

        String[] a = new String[] {"First", "Second", "Third"};
        printers(a);
    }
    private static void printers(String[] x) {
            System.out.println(Arrays.toString(x));
    }
}
