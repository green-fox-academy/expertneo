//Create a function that takes two arrays and mixes them like this: [1, 2, 3] and [6, 7, 8] becomes [1, 6, 2, 7, 3, 8]

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arrayOne = {1, 2, 3};
    int[] arrayTwo = {6, 7, 8};

    System.out.println("Most elegant solution: " + Arrays.toString(mixer_bestSolution(arrayOne,
            arrayTwo)));
    System.out.println("Solution one: " + Arrays.toString(mixer_solutionTwo(arrayOne, arrayTwo)));
    System.out.println("Solution two: " + Arrays.toString(mixer_solutionThree(arrayOne, arrayTwo)));
  }

  public static int[] mixer_bestSolution(int[] arrayOne, int[] arrayTwo) {
    int[] output = new int[arrayOne.length * 2];
    for (int i = 0; i < arrayOne.length; i++) {
      output[i * 2] = arrayOne[i];
      output[1 + i * 2] = arrayTwo[i];
    }
    return output;
  }

  public static int[] mixer_solutionTwo(int[] arrayOne, int[] arrayTwo) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < arrayOne.length; i++) {
      arrayList.add(arrayOne[i]);
      arrayList.add(arrayTwo[i]);
    }
    int[] output = new int[arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++) {
      output[i] = arrayList.get(i);
    }
    return output;
  }

  public static int[] mixer_solutionThree(int[] arrayOne, int[] arrayTwo) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < arrayOne.length; i++) {
      arrayList.add(arrayOne[i]);
      arrayList.add(arrayTwo[i]);
    }
    return convertIntegers(arrayList);
  }

  public static int[] convertIntegers(ArrayList<Integer> inputArray) {
    int[] output = new int[inputArray.size()];
    for (int i = 0; i < output.length; i++) {
      output[i] = inputArray.get(i).intValue();
    }
    return output;
  }
}
