import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class doubledJava {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    String path = "duplicated-chars.txt";

    List<String> qcCheck = loadingTheFile(path);
    doubleEliminator(qcCheck);
    String veryFinalString = doubleEliminator(qcCheck);
    System.out.println(veryFinalString);
  }

  private static String doubleEliminator(List<String> input1) {
    String listOriginal = String.join(",", input1);
    String[] listFinal = new String[(listOriginal.length() / 2)];
    String[] listOriginalSplit = listOriginal.split("");
    int counter = 0;
    for (int i = 0; i < (listOriginalSplit.length / 2); i++) {
      listFinal[i] = listOriginalSplit[counter];
      counter = (counter + 2);
    }
    return String.join("", listFinal);
  }

  private static List<String> loadingTheFile(String path) {
    List<String> text = new ArrayList<>();
    try {
      Path filePath = Paths.get(path);
      text = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Failed to open file!");
    }
    return text;
  }
}
