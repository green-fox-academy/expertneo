import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.println("Give your name!");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        System.out.println("Your name is " + userInput1);
    }
}
