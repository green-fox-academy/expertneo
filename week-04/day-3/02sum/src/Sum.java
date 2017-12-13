import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      lista.add(i,i);
    }

    Integer array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(array));

    System.out.println(lista);
    summation(lista);
    System.out.println("Summation of the list elements is the following:");
    System.out.println(summation(lista));

    System.out.println("Summation of the list elements is the following:");
    System.out.println(summation(lista2));
  }


  public static int summation(ArrayList<Integer> inputList) {
    int totalValue = 0;
    for (int i = 0; i < inputList.size() ; i++) {
      totalValue = totalValue + inputList.get(i);
    }
    return totalValue;
  }
}
