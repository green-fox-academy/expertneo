import java.util.Scanner;

public class summing {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter

        Scanner variable = new Scanner(System.in);
        int userInput = variable.nextInt();

        while (userInput != 0) {
            System.out.println(summing(userInput));
            Scanner variable2 = new Scanner(System.in);
            userInput = variable2.nextInt();
        }
    }

    private static int summing(int x) {
        int sum = 0;
        for (int i = 0; i < x + 1; i++) {
            sum += i;
        }
        return sum;
    }
}

