import java.lang.reflect.Array;
import java.util.ArrayList;

public class palindromeSearcher {
    boolean palindrome = true;
    static String output = new String();


    public static void main(String[] args) {
        String a = "dog goat dad duck doodle never";
        String b = "apple";
        String c = "racecar";


        palindromesearch(a);
        System.out.println(output);
//        palindromesearch(b);
//        System.out.println(output);
//        palindromesearch(c);
//        System.out.println(output);
    }

    private static void palindromesearch(String input1) {
        String[] initialStringArray = input1.split("");
        for (int gateLength = 3; gateLength < input1.length(); gateLength++) {
            for (int startingPoint = 0; startingPoint < (input1.length() - gateLength); startingPoint++) {
                String s = new String();
                String initialStringJoin = String.join("", initialStringArray);
                s = initialStringJoin.substring(startingPoint, (startingPoint + gateLength));
                palindromebuilder(s);
            }
        }
    }

    private static String palindromebuilder(String input1) {
        ArrayList<String> output2 = new ArrayList<>();
        String[] var1 = input1.split("");
        String[] temp1 = new String[input1.length()];

        for (int i = 0; i < input1.length(); i++) {
            temp1[i] = var1[input1.length() - i - 1];
        }
        boolean palindrome = (String.join("", temp1)).contains(input1);
        if (palindrome) {
            System.out.println("Found palindrome:" + input1);
            output = output + "\"" + input1 + "\" ";
            output2.add(input1);
        }
        return output;
    }
}
