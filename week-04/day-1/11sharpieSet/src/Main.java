public class Main {
  public static void main(String[] args) {

    Sharpie one = new Sharpie();
    Sharpie two = new Sharpie();
    for (int i = 0; i < 100; i++) {
      two.use();
    }
    Sharpie three = new Sharpie();

    SharpieSet tolltarto = new SharpieSet();
    tolltarto.addSharpies(one);
    tolltarto.addSharpies(two);
    tolltarto.addSharpies(three);

    System.out.println("Is it usable?! " + tolltarto.isUsable(one));
    System.out.println("Is it usable?! " + tolltarto.isUsable(two));
    System.out.println("Is it usable?! " + tolltarto.isUsable(three));

    tolltarto.removeTrash();
    System.out.println("Is it usable?! " + tolltarto.isUsable(one));
    System.out.println("Is it usable?! " + tolltarto.isUsable(two));
    System.out.println("Is it usable?! " + tolltarto.isUsable(three));
  }
}
