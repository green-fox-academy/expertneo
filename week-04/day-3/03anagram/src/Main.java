import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    String a = "god";
    String b = "dog";

    anagramChecker(a,b);
    System.out.println(anagramChecker(a,b));
  }

  public static boolean anagramChecker(String a, String b){
    List<String> a_split = Arrays.asList(a.split(""));
    List<String> b_split = Arrays.asList(b.split(""));
    if (a_split.containsAll(b_split)) {
      return true;
    } else {
      return false;
    }
  }
}
