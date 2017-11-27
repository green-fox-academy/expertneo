import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner var1 = new Scanner(System.in);
        int userInput1 = var1.nextInt();

        Scanner var2 = new Scanner(System.in);
        int userInput2 = var2.nextInt();

        if (userInput1>userInput2) {
            System.out.println(userInput1);
        }
        else {
            System.out.println(userInput2);
        }
    }
}
