import java.util.*;

public class unique {
    public static void main(String[] args) {

        Map<Integer, Integer> input = new HashMap<>();
        input.put(0, 1);
        input.put(1, 11);
        input.put(2, 11);
        input.put(3, 34);
        input.put(4, 11);
        input.put(5, 52);
        input.put(6, 61);
        input.put(7, 1);
        input.put(8, 34);
        Map<Integer, Integer> output = new HashMap<>();

        System.out.println("Original values: ");
        System.out.println(input);
        int var=0;

        for (int i = 0; i < input.size(); i++) {
            // Let's check if result contains input already
            boolean contains = false;
            for (int j = 0; j < output.size() && !contains; j++) {
                if (input.get(i).equals(input.get(j))) {
                    contains = true;
                }
            }
            if (!contains) {
                var=(var+1);
                output.put(var, input.get(i));
            }
        }
        System.out.println("Modified values: ");
        System.out.println(output);
    }
}

