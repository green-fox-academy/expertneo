import java.awt.*;

public class main {
  public static void main(String[] args) {
    postIt trial1 = new postIt();
    trial1.setBackgroundColor(Color.blue);
    trial1.setText("Lol");
    trial1.setTextColor(Color.black);

    postIt trial2 = new postIt();
    trial2.setBackgroundColor(Color.pink);
    trial2.setText("Lol2");
    trial2.setTextColor(Color.pink);

    postIt trial3 = new postIt();
    trial3.setBackgroundColor(Color.gray);
    trial3.setText("Lol3");
    trial3.setTextColor(Color.gray);

    System.out.println(trial2.textColor); //QC
  }
}
