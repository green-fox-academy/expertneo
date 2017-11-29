import java.util.*;

public class list06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

        if (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16)){
            boolean asd = true;
            System.out.println(asd);
        }
        else {
            boolean asd = false;
            System.out.println(asd);
        }
    }
}
