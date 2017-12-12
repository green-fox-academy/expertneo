import java.awt.*;

public class Plant {
  private Color color;
  int waterStatus;
  boolean needWater;

  public Plant (Color color, int waterStatus){
    this.color = color;
    this.waterStatus = waterStatus;
  }

  public Plant () {
    this.color = Color.green;
    this.waterStatus = 0;
  }

  public int getWaterStatus(){
    return this.waterStatus;
  }

  public void setWaterStatus(int waterStatus) {
    this.waterStatus = waterStatus;
  }

  public Color getColor (){
    return this.color;
  }
}
