import java.util.Arrays;

public class double2 {
    public static void main(String[] args) {
        // - Create an array variable named `ag`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array

        int[] ag = new int[] {3, 4, 5, 6, 7};

        for (int i = 0; i < ag.length; i++) {
            ag[i] = (ag[i]*2);
        }
        System.out.println(Arrays.toString(ag));
    }
}
