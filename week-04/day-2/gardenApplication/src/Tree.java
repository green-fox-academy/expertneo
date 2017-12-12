import java.awt.*;

public class Tree extends Plant {

  public Tree (String type, String size, Color color, int waterStatus) {
    super(type, size, color, waterStatus);
  }

  public Tree () {
    super("zold levelu", "Medium", Color.green, 0);
  }

  public int water (int waterAmount) {
    waterStatus += waterAmount;
    return waterStatus;
  }
}
