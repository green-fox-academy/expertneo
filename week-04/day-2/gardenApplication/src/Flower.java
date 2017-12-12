import java.awt.*;

public class Flower extends Plant {

  public Flower (Color color, int waterStatus) {
    super(color, waterStatus);
  }

  public Flower () {
    super(Color.green, 0);
  }

  public int water (int waterAmount) {
    waterStatus += waterAmount;
    return waterStatus;
  }
}
