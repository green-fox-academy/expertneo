import java.awt.*;

public class Flower extends Plant {

  public Flower (String type, String size, Color color, int waterStatus) {
    super(type, size, color, waterStatus);
  }

  public Flower () {
    super("zold levelu", "Medium", Color.green, 0);
  }

  public int water (int waterAmount) {
    waterStatus += waterAmount;
    return waterStatus;
  }
}
