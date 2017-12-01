//        Create a function that takes a string and a list of string as a parameter
//        Returns the index of the string in the list where the first string is part of
//        Returns -1 if the string is not part any of the strings in the list
//
//        input: "ching", ["this", "is", "what", "I'm", "searching", "in"]
//        output: 4

import java.util.*;

public class findTheSubstring {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("what");
        list.add("I'm");
        list.add("searching");
        list.add("in");

        String asd = ("ching");

        HashMap<Integer, Object> hmap = new HashMap<>();
        hmap.put(1, list);
        hmap.put(2, asd);

        finder(list, asd);
    }
    public static void finder (ArrayList<String> input1, String input2) {
        int returnValue = -1;
        boolean contains = false;
        int counter = 0;
        for (int i = 0; i < input1.size(); i++) {
            contains = input1.get(i).contains(input2);
            if (contains == true) {
                counter++;
                System.out.println("Index of the string containing keyword: " + i);
            }
        }
        if (counter == 0) {
            System.out.println(-1);
        }
    }
}
