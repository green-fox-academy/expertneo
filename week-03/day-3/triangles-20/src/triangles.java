import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class triangles {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/triangles/r5.png]

    double side = WIDTH/21;
    double mVar =Math.sqrt(Math.pow(side, 2) - Math.pow((side/2), 2));
    int m = (int) mVar;

    int x2 = WIDTH/2;
    int y2 = 0;
    for (int i = 0; i < WIDTH; i = i + WIDTH/21) {
      graphics.drawLine(i, m*21, x2, y2);
      x2 = (int) (x2 + side/2);
      y2 = (y2 + m);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
