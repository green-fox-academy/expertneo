import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
//    Write a Stream Expression to find which number squared value
//    is more then 20 from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers.stream()
            .filter(number -> (number * number) > 20)
            .forEach(System.out::println);
  }
}
