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

  public char[][] readBoard(String fileName) {
    Path filePath = Paths.get(fileName);
    char[][] labirinthLayout = new char[10][10];
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j++) {
          labirinthLayout[i][j] = lines.get(i).charAt(j);
        }
      }
    } catch (Exception e) {
      System.out.println("Oh no");
    }
    return labirinthLayout;
  }

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

  public boolean[][] canWalkthereChecker(String fileName) {
    char[][] labirinthLayout = readBoard(fileName);
    boolean[][] canWalkThere = new boolean[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (labirinthLayout[i][j] == 'p') {
          canWalkThere[i][j] = true;
        } else {
          canWalkThere[i][j] = false;
        }
      }
    }
    return canWalkThere;
  }
}