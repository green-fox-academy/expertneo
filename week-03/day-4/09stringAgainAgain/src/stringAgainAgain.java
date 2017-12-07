public class stringAgainAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".

    String asd = "fuck my life";

    System.out.println(separator(asd));
  }

  private static String separator(String input) {
    if (input.length() == 1) {
      return input;
    } else {
      return  input.substring(0,1) + "*" + separator(input.substring(1));
    }
  }
}
