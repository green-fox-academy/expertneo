public class sumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    int n = 11;
    System.out.println(digitAdder(n));
    System.out.println( 20 % 10);

  }

  private static int digitAdder(int n) {
    if (n == 0) {
      return n;
    } else {
      return digitAdder(n/10) + n % 10;
    }
  }
}
