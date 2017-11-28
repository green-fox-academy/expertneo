import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = new int[] {3, 4, 5, 6, 7} ;
        int[] var = new int[aj.length];

        for (int i=0; i<aj.length; i++) {
            var[(aj.length-i-1)] = aj[i];
        }
        aj = var;
        System.out.println(Arrays.toString(aj));
    }
}
