import java.awt.*;

public class Tree extends Plant {
  String type;

  public Tree (String color, int waterStatus) {
    super(color, waterStatus);
    this.type = "Tree";
  }

  public Tree () {
    super("green", 0);
    this.type = "Tree";
  }

  public int water (int waterAmount) {
    waterStatus = waterStatus + ((int)(((double) waterAmount)*0.4));
    return waterStatus;
  }

  public String getType(){
    return this.type;
  }

  public String isNeedWater(){
    if (waterStatus < 10) {
      return "needs water.";
    } else {
      return "doesn't need water.";
    }
  }
}
