import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class copyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String path = "bence.txt";
    String pathToCopy = "lilla.txt";

    functionToCopyFile(path, pathToCopy);
    if (functionToCopyFile(path, pathToCopy)) {
      System.out.println("The copy was successful!");
    } else {
      System.out.println("The copy was not successful!");
    }
  }

  private static boolean functionToCopyFile(String pathInput, String outputFileName) {
    boolean result = true;
    try {
      Path copyFrom = Paths.get(pathInput);
      Path copyTo = Paths.get(outputFileName);
      Files.copy(copyFrom, copyTo, REPLACE_EXISTING);
    } catch (IOException e) {
      result = false;
    }
    return result;
  }
}
