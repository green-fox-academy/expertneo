import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner var1 = new Scanner(System.in);
        int userInput1 = var1.nextInt();

        Scanner var2 = new Scanner(System.in);
        int userInput2 = var2.nextInt();

        Scanner var3 = new Scanner(System.in);
        int userInput3 = var3.nextInt();

        Scanner var4 = new Scanner(System.in);
        int userInput4 = var4.nextInt();

        Scanner var5 = new Scanner(System.in);
        int userInput5 = var5.nextInt();

        int summation = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        int average = summation/5;

        System.out.println("The summation of the numbers are " + summation);
        System.out.println("The average of the numbers are " + average);
    }
}
