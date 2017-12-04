import java.util.*;

public class errorHandling {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int division = scanner.nextInt();

        try {
            int result = 10/division;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}
