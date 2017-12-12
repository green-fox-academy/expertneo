import java.awt.*;
import java.util.concurrent.Flow;

public class Flower extends Plant {
  String type;

  public Flower (Color color, int waterStatus) {
    super(color, waterStatus);
    this.type = "Flower";
  }

  public Flower () {
    super(Color.green, 0);
    this.type = "Flower";
  }

  public int water (int waterAmount) {
    waterStatus = waterStatus + ((int)(((double) waterAmount)*0.75));
    return waterStatus;
  }

  public String getType(){
    return this.type;
  }

  public String isNeedWater(){
    if (waterStatus < 5) {
      return "needs water.";
    } else {
      return "doesn't need water.";
    }
  }
}
