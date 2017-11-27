import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.println("Write the number in KMs!");
        Scanner scanner2 = new Scanner(System.in);
        double output = scanner2.nextInt();
        output = output * 0.621371;
        System.out.println(output);
    }
}
