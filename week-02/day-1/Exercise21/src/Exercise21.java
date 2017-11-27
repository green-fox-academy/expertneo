import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        System.out.println("Give me two numbers: girls, boys");

        Scanner var1 = new Scanner(System.in);
        int userInput1 = var1.nextInt();

        Scanner var2 = new Scanner(System.in);
        int userInput2 = var2.nextInt();

        int totalNumber = userInput1 + userInput2;
        if ((userInput1 == userInput2) && (totalNumber > 20)) {
            System.out.println("The Party is excellent!");
        }
        else if ((totalNumber > 20) && (userInput1 != userInput2)) {
            System.out.println("Quite cool party!");
        }
        else if (totalNumber < 20) {
            System.out.println("Average party");
        }
        else
            System.out.println("Sausage party");
    }
}
