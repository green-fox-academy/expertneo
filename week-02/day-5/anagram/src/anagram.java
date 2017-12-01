//        Create a function named is anagram following your current language's style guide.
//        It should take two strings and return a boolean value depending on whether its an anagram or not.
//
//        input 1	input 2	output
//        "dog"	    "god"	true
//        "green"	"fox"	false

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String a = "dog";
        String b = "god";

        anagramChecker(a, b);
    }

    private static boolean anagramChecker(String input1, String input2) {
        String[] aSplit = input1.split("");
        String[] bSplit = input2.split("");
        String[] temp2 = new String[input1.length()];

        for (int i = 0; i < input1.length(); i++) {
            temp2[i] = aSplit[aSplit.length - i - 1];
        }

        System.out.println(Arrays.toString(temp2));         //QC
        System.out.println(Arrays.toString(bSplit));         //QC
        boolean decision = (Arrays.toString(temp2).contains(Arrays.toString(bSplit)));
        if (decision) {
            System.out.println("It is an anagram");
        } else {
            System.out.println("It is not an anagram");
        }
        return decision;
    }
}
