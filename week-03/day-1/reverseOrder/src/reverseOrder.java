import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class reverseOrder {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    String path = "reverse-order.txt";

    readingThefile(path);
    System.out.println(path);   //
    reversingOrder(readingThefile(path));
  }

  private static void reversingOrder(List<String> inputText) {
    for (int i = inputText.size()-1; i > 0; i--) {
      for (int j = 0; j < inputText.get(i).length(); j++) {
        System.out.print(inputText.get(i).charAt(j));
      }
      System.out.println();
    }
  }

  private static List<String> readingThefile(String inputText) {
    List<String> text = new ArrayList<>();
    try {
      Path filePath = Paths.get(inputText);
      text = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.err.println("Importing the file went into an error. Fix it.");
    }
    return text;
  }
}
