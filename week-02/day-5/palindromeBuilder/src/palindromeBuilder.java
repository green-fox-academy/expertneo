import java.util.*;

public class palindromeBuilder {
    public static void main(String[] args) {
        String a = "greenfox";
        String b = "123";

        builder(a);
        builder(b);
    }

    private static String builder(String input1) {
        String[] var1 = input1.split("");
        String[] temp1 = new String[input1.length()];

        for (int i = 0; i < input1.length(); i++) {
            temp1[i] = var1[input1.length() - i - 1];
        }
        String outputTrial = String.join("", temp1);
//        System.out.println(outputTrial);     //QC
        String output = input1 + (outputTrial);
        System.out.println("The palindromebuilder resulted in: " + output);
        return output;
    }
}
