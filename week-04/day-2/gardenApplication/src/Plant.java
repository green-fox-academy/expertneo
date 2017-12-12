import java.awt.*;

public class Plant {
  String type;  //if tree, oak tree or some other tree, etc.
  String size;  //Large, medium or small
  Color color;
  int waterStatus;

  public Plant (String type, String size, Color color, int waterStatus){
    this.type = type;
    this.size = size;
    this.color = color;
    this.waterStatus = waterStatus;
  }

  public Plant () {
    this.type = "zold levelu";
    this.size = "Medium";
    this.color = Color.green;
    this.waterStatus = 0;
  }

  public int getWaterStatus(){
    return this.waterStatus;
  }

  public void setWaterStatus(int waterStatus) {
    this.waterStatus = waterStatus;
  }
}
