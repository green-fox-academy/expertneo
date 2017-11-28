import java.util.Arrays;

public class appenda {
    public static void main(String[] args) {
        // - Create an array variable named `nimals`
        //   with the following content: `["kuty", "macsk", "cic"]`
        // - Add all elements an `"a"` at the end

        String[] nimals = new String[] {"kuty", "macsk", "cic"};
        for (int i = 0; i < nimals.length; i++) {
            nimals[i]= nimals[i] + "a";
        }
        System.out.println(Arrays.toString(nimals));
    }
}
