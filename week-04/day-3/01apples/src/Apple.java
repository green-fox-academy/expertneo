import java.awt.*;

public class Apple {
  String name;
  Color color;

  public Apple (String name, Color color){
    this.name = name;
    this.color = color;
  }

  public  Apple (){
    this.name = "Golden";
    this.color = Color.red;
  }

  public String getName(){
    return this.name;
  }
}
