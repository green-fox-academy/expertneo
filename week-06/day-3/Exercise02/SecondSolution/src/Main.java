import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

//Write a Stream Expression to get the
//        average value of the odd numbers from the following array:


public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
            1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    OptionalDouble output = numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToDouble(n -> n)
            .average();

    System.out.println(output.getAsDouble());
  }
}
