import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FavouriteAnimals {
  public static void main(String[] args) {
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    // ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them

    List<String> favAnimals;
    favAnimals = readFile("favourites.txt");

    if (args.length == 0) {
      printUsage();
      System.exit(1);
    } else if (args.length > 1) {
      for (int i = 0; i < args.length; i++) {
        favAnimals.add(args[i].toString());
      }
      writeFile("favourites.txt", favAnimals);
    }
  }

  private static void printUsage() {
    System.out.println("java FavouriteAnimals [animal] [animal]");
  }

  private static List<String> readFile(String filename) {
    List<String> content;
    try {
      Path filePath = Paths.get(filename);
      content = Files.readAllLines(filePath);
      return content;
    } catch (IOException exception) {
      System.out.println("The file does not exist!");
      System.exit(-1);
      return null;
    }
  }

  private static void writeFile(String filename, List<String> linesToWrite) {
    try {
      Path filePath = Paths.get(filename);
      Files.write(filePath, linesToWrite);
    } catch (IOException exception) {
      System.out.println("Error during writing the file");
    }
  }
}

