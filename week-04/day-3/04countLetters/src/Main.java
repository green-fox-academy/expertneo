import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    String text = "benceee";

    letterCounter(text);
    System.out.println(letterCounter(text));
  }

  public static HashMap letterCounter(String input) {
    List<String> inputSplit = Arrays.asList(input.split(""));
    HashMap<String, Integer> dictionary = new HashMap<>();

    for (int i = 0; i < inputSplit.size(); i++) {
      if (!dictionary.containsKey(inputSplit.get(i))) {
        dictionary.put(inputSplit.get(i), 1);
      } else {
        dictionary.put(inputSplit.get(i), dictionary.get(inputSplit.get(i)) + 1);
      }
    }
    return dictionary;
  }
}
