import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Appearance extends Objects {

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
          Objects floor = new Objects("floor.png", j * 72, i * 72);
          floor.draw(graphics);
        } else {
          Objects wall = new Objects("wall.png", j * 72, i * 72);
          wall.draw(graphics);
        }
      }
    }
  }
}