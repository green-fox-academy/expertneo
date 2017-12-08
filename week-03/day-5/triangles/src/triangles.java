import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class triangles {
  public static void mainDraw(Graphics graphics) {

    int level = 3;
    int size = WIDTH;
    int padding = 10;

    graphics.setColor(Color.gray);
    graphics.fillRect(0,0,WIDTH, HEIGHT);
    graphics.setColor(Color.black);

    int[] x = new int[3];
    x[0]=0+padding;
    x[1]=size-padding;
    x[2]=size/2;

    int[] y = new int[3];
    y[0]=0+padding;
    y[1]=0+padding;
    y[2]=size-padding;

    graphics.setColor(Color.WHITE);
    graphics.fillPolygon(x, y, 3);
    graphics.setColor(Color.black);
    graphics.drawPolygon(x, y, 3);

    x[0]=size/2 - size*2/8;
    x[1]=size/2 + size*2/8;
    x[2]=size/2;

    y[0]=size/2;
    y[1]=size/2;
    y[2]=0;

    recursiveLoop(graphics, level, x, y, size);
  }

  private static void drawTriangle(Graphics graphics, int[] x, int[] y) {
    graphics.setColor(Color.BLACK);
    graphics.drawPolygon(x, y, 3);
  }

  private static void recursiveLoop(Graphics graphics, int level, int[] x, int[] y, int size) {
    if (level == 0) {
      return;
    } else {
      graphics.setColor(Color.BLACK);
      drawTriangle(graphics, x, y);

      int[] x1 = new int[3];    //DONE
      x1[0] = x[0] / 2;
      x1[1] = x[1] / 2;
      x1[2] = x[2] / 2;
      int[] y1 = new int[3];    //DONE
      y1[0] = y[0] / 2;
      y1[1] = y[1] / 2;
      y1[2] = y[2];

      int[] x2 = new int[3];
      x2[0] = x[0]*5 / 2;
      x2[1] = x[0]*7 / 2;
      x2[2] = x[1];
      int[] y2 = new int[3];
      y2[0] = y[0] / 2;
      y2[1] = y[1] / 2;
      y2[2] = y[2];

      int[] x3 = new int[3];
      x3[0]= x1[1];
      x3[1]= x[0]*5 / 2;
      x3[2]=x[2];
      int[] y3 = new int[3];
      y3[0]=y[0] + size / 4;
      y3[1]=y[0] + size / 4;
      y3[2]=y[0];

      recursiveLoop(graphics, level - 1, x1, y1, size/2);
      recursiveLoop(graphics, level - 1, x2, y2, size/2);
      recursiveLoop(graphics, level - 1, x3, y3,  size/2);
    }
  }


  //    Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

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
