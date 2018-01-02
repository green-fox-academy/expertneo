import java.util.Collection;
import java.util.Collections;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    fleet.add(new Thing("Stand up"));
    fleet.add(new Thing("Eat lunch"));

    fleet.getThings().get(2).setCompleted(true);
    fleet.getThings().get(3).setCompleted(true);

    System.out.println(fleet);

    System.out.println("Solution for the 02Jan2018 exercise");
      for (Thing things : fleet.getThings()) {
        things.printAllFields();
      }
  }
}
