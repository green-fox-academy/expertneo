import java.util.*;

public class otherMethod {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        System.out.println("Input string one");
        String a = asd.next();
        System.out.println("Input string two");
        String b = asd.next();

//        String a = "god";
//        String b = "dog";

        anagramchecker(a, b);
        System.out.println(anagramchecker(a, b));

    }

    private static boolean anagramchecker(String input1, String input2) {
        List <String> var1 = Arrays.asList(input1.split(""));
        List <String> var2 = Arrays.asList(input2.split(""));
        boolean anagram = var1.containsAll(var2);
        if (anagram) {
            System.out.println("This is an anagram");
        } else {
            System.out.println("This is not an anagram");
        }
        return  anagram;
    }
}
