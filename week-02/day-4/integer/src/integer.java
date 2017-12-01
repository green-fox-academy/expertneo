import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class integer {
    public static void main(String[] args) {
//        Create a function that takes a number and a list of numbers as a parameter
//        Returns the indeces of the numbers in the list where the first number is part of
//        Returns an empty list if the number is not part any of the numbers in the list
//        input: [1, 11, 34, 52, 61], 1
//        output: [0, 1, 4]

        String numberString = "1";
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61));
        ArrayList<String> listString = new ArrayList<>();

        listString.add("1");
        listString.add("11");
        listString.add("34");
        listString.add("52");
        listString.add("61");

        System.out.println(list.size());
        function(listString, numberString);

//      ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61).)

    }

    public static void function(ArrayList<String> input1, String input2) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < input1.size(); i++) {
            boolean checker = (input1.get(i)).contains(input2);
            if (checker == true) {
                System.out.println("One at line: " + i);
                output.add(i);
            }
        }
        System.out.println(output);
    }
}
