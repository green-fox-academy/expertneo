import java.util.*;

public class substring {
    public static void main(String[] args) {
//        Create a function that takes two strings as a parameter
//        Returns the starting index where the second one is starting in the first one
//        Returns -1 if the second string is not in the first one
//
//        input: "this is what I'm searching in", "searching"
//        output: 17

        ArrayList<String> input1 = new ArrayList<>();
        input1.add("This is what I'm searching in");
        input1.add("searching");
        lol(input1.get(0), input1.get(1));

    }

    public static void lol(String input1, String input2) {
        Boolean found = Arrays.asList(input1.split(" ")).contains(input2);
        if (found) {
            System.out.println("found");
        } else {
            System.out.println("No match in the two Strings...");
        }
        System.out.println(input1.indexOf(input2));
        return;
    }
}
