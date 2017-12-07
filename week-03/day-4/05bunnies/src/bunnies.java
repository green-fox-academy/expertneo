public class bunnies {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    int bunnies = 20;
    int ears = 0;
    System.out.print(computeEar(bunnies, ears));

  }

  private static int computeEar(int bunnies, int ears) {
    if (bunnies == 0) {
      return ears;
    }
    else {
      return computeEar(bunnies-1, ears + 2);
    }
  }
}
