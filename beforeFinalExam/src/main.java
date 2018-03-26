import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
    String input = "bence vagyok es fasza gyerek";
    System.out.println(toUpperCase(input));
  }

  private static String toUpperCase(String input) {
    ArrayList<String> characters = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < input.length()-1; i++) {
      characters.add(input.substring(i, i+1).toUpperCase());
      stringBuilder.append(characters.get(i));
    }
    return stringBuilder.toString();
  }
}
