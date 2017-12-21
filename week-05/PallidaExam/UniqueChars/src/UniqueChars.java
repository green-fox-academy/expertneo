import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueChars {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases

    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  public static List<Character> uniqueCharacters(String input) {
    String characterContainer;
    List<String> listOfCharacters = splitter(input);
    for (int i = 0; i < listOfCharacters.size(); i++) {
      listOfCharacters.set(i, listOfCharacters.get(i).toLowerCase());
    }
    List<Character> listOfUniqueCharacters = new ArrayList<>();
    for (int i = 0; i < listOfCharacters.size(); i++) {
      characterContainer = listOfCharacters.get(i);
      listOfCharacters.set(i, "0");
      if (!listOfCharacters.contains(characterContainer)) {
        listOfUniqueCharacters.add(characterContainer.charAt(0));
      }
      listOfCharacters.set(i, characterContainer);
    }
    return listOfUniqueCharacters;
  }

  public static List<String> splitter(String input) {
    List<String> listOfCharacters = Arrays.asList(input.split(""));
    return listOfCharacters;
  }
}
