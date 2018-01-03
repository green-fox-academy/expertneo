import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    String string = "bencebence";
    String[] splitString = string.split("");

    Map<String, Long> frequencies = Arrays.stream(splitString)
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    System.out.println(frequencies);
  }
}
