import javafx.scene.Group;

import java.lang.reflect.Array;
import java.util.*;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> initial = new ArrayList<>(Arrays.asList(34, 12, 24, 9, 5));
        System.out.println("Initial arraylist: \n" + initial);

        /* ArrayList before the sorting*/
        System.out.println("Before Sorting:");
        for (int counter : initial) {
            System.out.println(counter);
        }

        /* Sorting of arraylist using Collections.sort*/
        Collections.sort(initial);

//	   /* ArrayList after sorting*/
//        System.out.println("After Sorting:");
//        for (int counter : initial) {
//            System.out.println(counter);

        boolean selector = true;

        if (selector == true) {
            descending(initial);
        } else {
            ascending(initial);
        }
    }

    public static void ascending(ArrayList<Integer> input) {
        System.out.println("After Sorting (ascending):");
        for (int counter : input) {
            System.out.println(counter);
        }
    }

    public static void descending(ArrayList<Integer> input) {
        Collections.sort(input, Collections.reverseOrder());
        System.out.println("After Sorting (descending):");
        for (int counter : input) {
            System.out.println(counter);
        }
    }
}
