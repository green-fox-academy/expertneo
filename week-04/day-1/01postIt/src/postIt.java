//Create a PostIt class that has
//        a backgroundColor
//        a text on it
//        a textColor
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

import java.awt.*;

public class postIt {
  Color backgroundColor;
  String text;
  Color textColor;

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setTextColor(Color textColor) {
    this.textColor = textColor;
  }
}
