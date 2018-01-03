import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    char[] input = {'b', 'e', 'n', 'c', 'e', '!'};

    List<String> listOfStrings = Stream.of(input).map(String::valueOf).collect(Collectors.toList());
    String output = listOfStrings.toString();
    System.out.println(output);
  }
}
