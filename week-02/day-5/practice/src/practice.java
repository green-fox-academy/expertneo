import java.util.*;

public class practice {
    public static void main(String[] args) {

        scanning()
        
        Scanner input10 = new Scanner(System.in);
        int lilla = 5;
        int bence = 3;
        int summary2 = addition(lilla, bence);
        System.out.println(addition(lilla, bence));
        System.out.println(summary2);
    }

    private static void scanning() {
    }

    private static int addition(int input1, int input2) {
        int summary = input1 + input2;
        return summary;
    }
}
