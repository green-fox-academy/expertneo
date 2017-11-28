public class factorial {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        int input = 11;
        System.out.println(factorio(input));

    }
    public static int factorio (int x) {
        int factorial = 1;
        if (x == 0) {
            factorial = 1;
        }
        else {
            for (int i = 1; i < x + 1; i++){
                factorial *= i;
        }
        }
    return factorial;
    }
}
