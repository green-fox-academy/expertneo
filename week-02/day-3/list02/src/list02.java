import java.util.*;

public class list02 {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        int var = girls.size();

        for (int i=0; i<var; i++) {
            if (i%2 == 0){
                order.add(i, girls.get(i/2));
            }
            else {
                order.add(i, boys.get(i/2));
            }
        }
        System.out.println(order);
    }
}
