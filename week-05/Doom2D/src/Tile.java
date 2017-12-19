import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Tile extends AnyObjects {
  boolean isWall;

  BufferedImage path;
  BufferedImage wall;
  char[][] boardMatrix = readBoard("map.txt");
  AnyObjects justACall;

  public void drawBoard(Graphics graphics, char[][] boardMatrix) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (boardMatrix[i][j] == 'p') {
          AnyObjects floor = new AnyObjects("floor.png", j * 72, i * 72);
          floor.draw(graphics);
        } else {
          AnyObjects wall = new AnyObjects("wall.png", j * 72, i * 72);
          wall.draw(graphics);
        }
      }
    }
  }
}