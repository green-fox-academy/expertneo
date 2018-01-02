public class Main {
  public static void main(String[] args) {

    Gnirts g = new Gnirts("example");
    System.out.println("Gnirts expercise return value");
    System.out.println(g.charAt(1));
    // should print out: l

    Shifter s = new Shifter("example", 2);
    System.out.println("Shifter expercise return value");
    System.out.println(s.charAt(0));
    // should print out: a
  }
}
