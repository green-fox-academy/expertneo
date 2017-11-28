import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int dim=4;
        int[][] array = new int[dim][dim];

        for (int i=0; i < dim; i++) {
            for (int j=0; j < dim; j++) {
                if (i==j) {
                    array[i][j] = 1;
                }
                else {
                    array[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
        //or
        for (int i=0; i<dim; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
