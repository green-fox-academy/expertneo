import java.awt.*;

public class Sharpie {
  Color color;
  float width;
  float inkAmount = 100;

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  public void setWidth (float width) {
    this.width = width;
  }

  public float getWidth(){
    return this.width;
  }

  public float use () {
    inkAmount -= 10;
    return inkAmount;
  }

  public float getInkAmount (){
    return this.inkAmount;
  }
}
