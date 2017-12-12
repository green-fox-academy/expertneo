import java.awt.*;

public class Tree extends Plant {

  public Tree (Color color, int waterStatus) {
    super(color, waterStatus);
  }

  public Tree () {
    super(Color.green, 0);
  }

  public int water (int waterAmount) {
    waterStatus += waterAmount;
    return waterStatus;
  }
}
