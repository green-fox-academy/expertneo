import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

  //  draw a red horizontal line to the canvas' middle.
  //  draw a green vertical line to the canvas' middle.

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.red);
    graphics.drawLine((WIDTH/2)-100, HEIGHT/2, (WIDTH/2)+100, HEIGHT/2);

    graphics.setColor(Color.green);
    graphics.drawLine(WIDTH/2, (HEIGHT/2)-100, WIDTH/2, (HEIGHT/2)+100);
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
