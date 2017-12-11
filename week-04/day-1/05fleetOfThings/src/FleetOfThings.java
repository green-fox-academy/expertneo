
public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing getMilk = new Thing("Get milk");
    getMilk.setCompleted(false);

    Thing removeTheObstacle = new Thing("Remove the obstacle");
    removeTheObstacle.setCompleted(false);

    Thing standUp = new Thing("Stand up");
    standUp.setCompleted(true);

    Thing eatLunch = new Thing("Eat lunch");
    eatLunch.setCompleted(true);

    Fleet final1 = new Fleet();
    final1.add(getMilk);
    final1.add(removeTheObstacle);
    final1.add(standUp);
    final1.add(eatLunch);


    System.out.println("FINAL LIST CREATED BY BENCE");
    System.out.println(final1);
  }
}