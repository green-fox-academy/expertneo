import java.util.*;

public class guessMyNumber {
    public static void main(String[] args) {
// Variables
        int range = 5;
        int life = 5;

        int numero = createRandNumb(range);
        while (life > 0) {
            System.out.println("New number please: ");
            life = life - 1;
            quiz(numero, life);
        }
    }

    private static int createRandNumb(int rangeVar) {
        Random startingNumber = new Random();
        int numberToGuess = startingNumber.nextInt(rangeVar)+1;
        return numberToGuess;
    }

    private static void quiz(int number, int lifeVar) {
        Scanner scan = new Scanner(System.in);
//        System.out.println(number);       QC
        int newLife = lifeVar;
        int guess = scan.nextInt();
        if (guess == number) {
            System.out.println("Congratulation, you won the game!");
            System.exit(1);
        } else if (guess > number && lifeVar != 0) {
            System.out.println("The guessed number is too large and you have " + newLife + " lives left.");
        } else if (guess < number && lifeVar != 0) {
            System.out.println("The guessed number is too small and you have " + newLife + " lives left.");
        } else {
            System.out.println("Sorry, the game is over, you ran out of life!");
            System.exit(1);
        }
    }
}




