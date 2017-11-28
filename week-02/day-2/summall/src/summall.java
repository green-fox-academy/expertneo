public class summall {
    public static void main(String[] args) {
        // - Create an array variable named `ai`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `ai`
        int summation = 0;

        int[] ai = new int[] {3, 4, 5, 6, 7};
        for (int i=0; i<ai.length; i++) {
            summation += ai[i];
        }
        System.out.println(summation);
    }
}
