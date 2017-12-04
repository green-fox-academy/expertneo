import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"

        try {
            String path = "C:\\Users\\Bence\\Dropbox\\GREENFOX\\JAVA\\PrintEachLine\\bence.txt";
            String javaPatch = path.replace("\\", "/");
            Path filePath = Paths.get(javaPatch);
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
    }
}
