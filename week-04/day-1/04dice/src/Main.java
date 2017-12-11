public class Main {
  public static void main(String[] args) {

    Dice new1 = new Dice();
    new1.roll();
    for (int i = 0; i < 5 ; i++) {
      while (new1.getCurrent()[i] != 6) {
        new1.reroll(i);
      }
    }
    System.out.println("Final drops: ");
    for (int i = 0; i < 5; i++) {
      System.out.println("Domino number:" + i);
      System.out.println(new1.getCurrent()[i]);
    }
  }
}
