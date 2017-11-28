public class Exercise28 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        int a = 15;
        String csillag = "";

        for (int i = 0; i<(a+1); i++) {
            csillag = csillag + "*";
            System.out.println(csillag);
        }
    }
}
