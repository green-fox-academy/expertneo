import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

        String[] abc = new String[] {"first", "second", "third"};
        String[] var = new String[] {"first", "second", "third"};
        abc[2] = abc[0];
        abc[0] = var[2];

        System.out.println(Arrays.toString(abc));
    }
}
