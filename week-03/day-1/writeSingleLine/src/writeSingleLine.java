import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class writeSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    List<String> contentToAdd = new ArrayList<>();
    contentToAdd.add("Bence Papp");
    String pathWindows = "my-file.txt";
    String path = pathWindows.replace("\\", "/");

    try {
      Path filePath = Paths.get(path);
      List<String> readLines = Files.readAllLines(filePath);
      Files.write(filePath, contentToAdd);
      System.out.println(readLines);
    } catch (Exception e){
      System.out.println("Unable to write file: " + path);
    }
  }
}
