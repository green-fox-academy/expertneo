import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs the farmer has
        // It should print how many legs all the animals have

        System.out.println("Please type two integer values (First chickens, then pigs)");
        Scanner var1 = new Scanner(System.in);
        int userInput1 = var1.nextInt ();

        Scanner var2 = new Scanner(System.in);
        int userInput2 = var2.nextInt ();

        System.out.println("Total legs: " + (userInput1 * 2 + userInput2 * 4));
    }
}
