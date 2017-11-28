import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        System.out.println("Please write a number to get its multiplication table");

        Scanner var1 = new Scanner(System.in);
        int userVariable1 = var1.nextInt();

        int sol = 0;
        for (int i = 1; i <= 10; i++) {
            sol = i * userVariable1;
            System.out.println(i + " * " + userVariable1 + " = " + sol);
        }
    }
}
