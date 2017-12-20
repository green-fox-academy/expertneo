import java.awt.*;

public class Plant {
  private String color;
  int waterStatus;
  boolean needWater;

  public Plant (String color, int waterStatus){
    this.color = color;
    this.waterStatus = waterStatus;
  }

  public Plant () {
    this.color = "green";
    this.waterStatus = 0;
  }

  public int getWaterStatus(){
    return this.waterStatus;
  }

  public void setWaterStatus(int waterStatus) {
    this.waterStatus = waterStatus;
  }

  public String getColor (){
    return this.color;
  }
}
