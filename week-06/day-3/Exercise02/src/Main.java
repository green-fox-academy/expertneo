import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to get the
//        average value of the odd numbers from the following array:


public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
            1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> filteredList = numbers.stream()
            .filter(x -> x % 2 != 0)
            .collect(Collectors.toList());

    int filteredSum = numbers.stream()
            .filter(x -> x % 2 != 0)
            .mapToInt(Integer::intValue)
            .sum();

    System.out.println((double) filteredSum / filteredList.size());
  }
}
