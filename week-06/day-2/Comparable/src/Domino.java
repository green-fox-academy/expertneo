import java.util.Arrays;

public class Domino implements Comparable<Domino> {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Domino domino) {
    int compareDominoNumber0 = domino.getValues()[0];
    int compareDominoNumber1 = domino.getValues()[1];
    if (this.getValues()[0] != compareDominoNumber0) {
      return this.getValues()[0] - compareDominoNumber0;
    } else {
      return this.getValues()[1] - compareDominoNumber1;
    }
  }
}