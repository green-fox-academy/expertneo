import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class reversedLines {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    String path = "reversed-lines.txt";

    List<String> importedText = readingthefile(path);
    System.out.println(importedText);   //QC

    decrypter(importedText);


  }

  private static void decrypter(List<String> inputText) {
    for (int i = 0; i < inputText.size(); i++) {
      for (int j = (inputText.get(i).length()); j > 0; j--) {
        System.out.print(inputText.get(i).charAt(j-1));
      }
      System.out.println();
    }
  }

  private static List<String> readingthefile(String inputPath) {
    List<String> initialText = new ArrayList<>();
    try {
      Path filePath = Paths.get(inputPath);
      initialText = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("IOException happened! You fucked up so BAD! :D");
    }
    return initialText;
  }
}
