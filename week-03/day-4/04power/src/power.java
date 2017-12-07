public class power {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    int n = 4;
    int base = 4;

    System.out.println(powerof(base, n));
  }

  private static int powerof(int base, int n) {
    if (n == 0) {
      return 1;
    }
    else {
      return base * powerof(base, n-1);
    }
  }
}
