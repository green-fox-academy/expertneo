import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class countLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();

    String routeToInput = "C:\\greenfox\\expertneo\\week-03\\day-1\\countLines\\bence.txt";
    String route = routeToInput.replace("\\", "/");
    linereader(route);

  }

  private static int linereader(String input) {
    int sizeVar = 0;
    try {
      Path filePath = Paths.get(input);
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.size());
      sizeVar = lines.size();
    } catch (Exception e) {
      System.out.println("Can't read the file");
      sizeVar = 0;
    }
    return sizeVar;
  }
}
