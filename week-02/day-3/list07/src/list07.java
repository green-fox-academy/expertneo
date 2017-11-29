import  java.util.*;

public class list07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code

        // Also, print the sentence to the output with spaces in between.
        // What I cannot create, I do not understand;

        ArrayList<String> quote = new ArrayList<String>(list);
        quote.set(2, list.get(5));
        quote.set(5, list.get(2));

        System.out.println(quote);
    }
}
