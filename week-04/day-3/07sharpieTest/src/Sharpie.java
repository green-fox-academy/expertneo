import java.awt.*;

public class Sharpie {
  Color color;
  int width;
  int inkAmount = 100;

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  public int setWidth (int  width) {
    this.width = width;
    return this.width;
  }

  public int getWidth(){
    return this.width;
  }

  public int use () {
    inkAmount -= 10;
    return inkAmount;
  }

  public int getInkAmount (){
    return this.inkAmount;
  }
}