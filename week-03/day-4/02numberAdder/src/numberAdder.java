public class numberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    System.out.println(adder(5));
  }

  private static int adder(int number) {
    if (number == 0) {
      return 0;
    } else {
      return adder(number - 1) + number;
    }
  }
}
