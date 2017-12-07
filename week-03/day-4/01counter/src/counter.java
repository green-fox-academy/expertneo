public class counter {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.


  recursiveFunctiob(5);

  }

  private static int recursiveFunctiob(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return recursiveFunctiob(n - 1);
    }
  }
}
