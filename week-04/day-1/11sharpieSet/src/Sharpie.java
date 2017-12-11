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

  public void use () {
    inkAmount -= 10;
  }

  public float getInkAmount (){
    return this.inkAmount;
  }
}