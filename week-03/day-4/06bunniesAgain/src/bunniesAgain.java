public class bunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    int bunnies = 10;
    int ears = 0;
    System.out.println(earCalculator(bunnies, ears));
    earCalculator(bunnies, ears);

  }

  private static int earCalculator(int bunnies, int ears) {
    if (bunnies % 2 == 0 && bunnies != 0) {
      return earCalculator(bunnies - 1, ears + 3);
    } else if (bunnies % 2 == 1 && bunnies != 0) {
      return earCalculator(bunnies - 1, ears + 2);
    } else {
      return ears;
    }
  }
}
