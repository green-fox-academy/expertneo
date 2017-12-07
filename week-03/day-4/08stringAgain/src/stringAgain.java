import java.util.ArrayList;
import java.util.Arrays;

public class stringAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // 'x' chars have been removed.

    String[] asd = "xxx yyy aaaxxxaaa FUCK RECURSIVE EXxxERCISE".split("");
    int index = 0;

    String finalString = String.join("", xRemover(asd, index));
    System.out.println(finalString);

  }

  private static String[] xRemover(String[] input, int index) {
    if (index<input.length && input[index].equals("x")) {
      input[index] = "";
      System.out.println(Arrays.asList(input));
      return xRemover(input, index+1);
    } else if (index<input.length){
      return xRemover(input, index+1);
    }
    return input;
  }
}
