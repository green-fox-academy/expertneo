import java.util.*;

public class list08 {
    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression:");
        Scanner var = new Scanner(System.in);
        String userInput1 = var.nextLine();

        if (userInput1.equals("+")) {
            System.out.println("Please type in the first number:");
            int userInput2 = var.nextInt();
            System.out.println("Please type in the second number:");
            int userInput3 = var.nextInt();
            int value = userInput2 + userInput3;
            System.out.println("The value of the added numbers are: ");
            System.out.println((value));
        } else if (userInput1.equals("*")) {
            System.out.println("Please type in the first number:");
            int userInput2 = var.nextInt();
            System.out.println("Please type in the second number:");
            int userInput3 = var.nextInt();
            int value = userInput2 * userInput3;
            System.out.println("The value of the multiplied numbers are: ");
            System.out.println((value));
        } else if (userInput1.equals("/")) {
            System.out.println("Please type in the first number:");
            int userInput2 = var.nextInt();
            System.out.println("Please type in the second number:");
            int userInput3 = var.nextInt();
            int value = userInput2 / userInput3;
            System.out.println("The value of the divided numbers are: ");
            System.out.println((value));
        } else {
            System.out.println("WTF is this operator?!");
        }
    }
}
