import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
//    Create a Fox class with 3 properties(name, type, color) Fill a list with at
//    least 5 foxes, it's up to you how you name/create them! Write a Stream Expression
//    to find the foxes with green color! Write a Stream Expression to find the foxes
//    with green color and pallida type!

    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("red", "small", "ASD1"));
    foxes.add(new Fox("blue", "medium", "ASD2"));
    foxes.add(new Fox("green", "pallida", "ASD3"));
    foxes.add(new Fox("green", "tiny", "ASD4"));
    foxes.add(new Fox("pink", "pallida", "ASD5"));

    System.out.println("------------------------------------------------");
    System.out.println("Find the foxes with green color:");
    foxes.stream()
            .filter(n -> n.getColor().equals("green"))
            .forEach(n -> System.out.println(n.getFox()));

    System.out.println("------------------------------------------------");
    System.out.println("Find the foxes with green color and pallida type: ");
    foxes.stream()
            .filter(n -> n.getColor().equals("green") && n.getType().equals("pallida"))
            .forEach(n -> System.out.println(n.getFox()));
  }
}
