import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.*;

public class starryNight {
  public static void mainDraw(Graphics graphics) {
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)

    // &&&&&&&&&&& BACKGROUND
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,WIDTH, HEIGHT);


    // &&&&&&&&&&& STARS


    for (int i = 0; i < 20; i++) {
      Random rand = new Random();
      float r = rand.nextFloat();
      float g = rand.nextFloat();
      float b = rand.nextFloat();
      Color randomColor = new Color(r, g, b);

      Double randomXdouble = Math.random()*((WIDTH - 0) + 1);
      Integer randomX = randomXdouble.intValue();

      Double randomYdouble = Math.random()*((HEIGHT - 0) + 1);
      Integer randomY = randomYdouble.intValue();

      graphics.setColor(randomColor);
      graphics.drawRect(randomX, randomY, 5, 5);
    }


  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
