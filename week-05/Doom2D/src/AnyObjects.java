import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AnyObjects {
  BufferedImage image;
  int posX, posY;

  public AnyObjects() {
  }

  public AnyObjects(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }

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
}
