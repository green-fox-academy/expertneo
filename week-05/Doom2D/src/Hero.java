import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero extends Characters {
  int level;
  Image image;

  public Hero() {
  }

  public Hero(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    this.level = 1;
    this.maxHP = 1000;
    this.currentHP = maxHP;
    this.isDead = false;
    this.defense = 100;
    this.attackPower = 100;
    try {
      image = ImageIO.read(new File("hero-down.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void setImageDown() {
    try {
      this.image = ImageIO.read(new File("hero-down.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void setImageLeft() {
    try {
      this.image = ImageIO.read(new File("hero-left.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void setImageRight() {
    try {
      this.image = ImageIO.read(new File("hero-right.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void setImageUp() {
    try {
      this.image = ImageIO.read(new File("hero-up.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}
