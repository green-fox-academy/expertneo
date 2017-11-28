public class Exercise29 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        int a = 10;
        int b = 0;
        while (b < a) {
            for (int i = b; i < a; i++) {
                System.out.print(" ");
            }
            for (int ii = 0; ii < (b * 2); ii++) {
                System.out.print("*");
            }
            System.out.println("*");
            b++;
        }
    }
}
