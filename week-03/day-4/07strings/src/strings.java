import java.util.*;

public class strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    String[] asd = "xxx yyy xxx xyx rereryx".split("");
    int index = 0;
    System.out.println(Arrays.toString(fontChanger(asd, index)));

    String finalVar = String.join("", fontChanger(asd, index));
    System.out.println(finalVar);
  }

  private static String[] fontChanger(String[] input, int index) {
    if (input[index].equals("x") && index < input.length-1) {
      input [index] = "y";
      return fontChanger(input, index + 1);
    }
    else if (index < input.length-1) {
      return fontChanger(input, index + 1);
    }
    else if (input[index].equals("x")){
      input [index] = "y";
      return input;
    }
    return input;
  }
}
