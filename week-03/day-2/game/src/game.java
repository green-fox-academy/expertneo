import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class game {
  public static void main(String[] args) {
    List<Integer> mountains = new ArrayList<>();
    mountains.add(0, 9);
    mountains.add(1,8);
    mountains.add(2, 7);
    mountains.add(3, 6);
    mountains.add(4, 5);

    Collections.sort(mountains);

    System.out.println(mountains);
  }
//
//
//
//  int Xmove = 0;
//  int Xpos = initialTX ;
//  int Ymove = 0;
//  int Ypos = initialTY;
//
//
//        if (initialTX < lightX) {
//    Xpos++;
//    Xmove = lightX - initialTX;
//  } else if (initialTX > lightX) {
//    Xpos--;
//    Xmove = initialTX - lightX;
//  }
//
//        if (initialTY < lightY) {
//    Ypos++;
//    Ymove = lightY - initialTY;
//  } else if (initialTY > lightY) {
//    Ypos--;
//    Ymove = initialTY - lightY;
//  }
//
//        if (Xpos < lightX && Ypos < lightY) {
//    System.out.println("SE");
//  } else if (Xpos > lightX && Ypos < lightY) {
//    System.out.println("SW");
//  }
//         else if (Xpos < lightX && Ypos > lightY) {
//    System.out.println("NE");
//  }
//         else if (Xpos > lightX && Ypos > lightY) {
//    System.out.println("NW");
//  }
//         else if (Xpos < lightX && Ypos == lightY) {
//    System.out.println("E");
//  }
//         else if (Xpos > lightX && Ypos == lightY) {
//    System.out.println("W");
//  }
//         else if (Xpos == lightX && Ypos < lightY) {
//    System.out.println("S");
//  }
//         else if (Xpos == lightX && Ypos > lightY) {
//    System.out.println("N");
//  }


}
