import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println("original order");
    System.out.println(dominoes);

    orderdominoes(dominoes);
    System.out.println("modified order");
    System.out.println(orderdominoes(dominoes));
  }

  private static List<Domino> orderdominoes(List<Domino> randomDominoes) {
    for (int i = 0; i < randomDominoes.size(); i++) {
      for (int j = i; j < randomDominoes.size(); j++) {
        if (randomDominoes.get(i).getValues()[1] == randomDominoes.get(j).getValues()[0]) {
          randomDominoes.add(i+1, randomDominoes.get(j));
          randomDominoes.remove(j+1);
        }
      }
    }
    return randomDominoes;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}