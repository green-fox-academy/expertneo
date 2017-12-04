import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class writeMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    String path = "apple.txt";
    String word = "apple";
    int numberOfLines = word.length();

    fileWriter(path, word, numberOfLines);
  }

  private static void fileWriter(String path, String text, int numberOfLines) {
    try {
      Path filepath = Paths.get(path);
      List<String> textToInput = new ArrayList<>();
      while (textToInput.size() != numberOfLines) {
        textToInput.add(text);
        Files.write(filepath, textToInput);
      }
      System.out.println("This is a quality control check");
      List<String> readFile = Files.readAllLines(filepath);
      System.out.println(readFile);
    } catch (IOException unableToWrite) {
    }
  }
}
