import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // Than prints "Odd" if the number is odd, or "Even" it it is even.

        Scanner variable = new Scanner(System.in);
        int userInput = variable.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("The number is EVEN");
        }
        else {
            System.out.println("The number is ODD");
        }
    }
}
