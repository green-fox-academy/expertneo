import java.util.*;

public class list05 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!

        boolean var1 = arrayList.contains("7");
//        System.out.println(var1);
    if (var1 == true) {
        System.out.println("Hoorray");
    }
    else {
        System.out.println("Nooooo");
    }
    }
}
