import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    String input = "Rome I Love YOU";

    input.chars()
            .filter((c) -> Character.isUpperCase(c))
            .forEach(c -> System.out.println((char) c));
  }
}
