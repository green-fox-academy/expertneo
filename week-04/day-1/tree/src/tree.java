import java.util.ArrayList;
import java.util.List;

public class tree {
  String type;
  String leafColor;
  int age;
  char sex;

  public  tree (String type, String leafColor, int age, char sex) {
    super();
    this.type = type;
    this.leafColor = leafColor;
    this.age = age;
    this.sex = sex;

    List<tree> myTrees = new ArrayList<>();

    tree mapple = new tree ("Large", "Yellow", "200", "F");
    tree ebony = new tree ("medium", "Yellow", "34", "M");
    tree oak = new tree ("Large", "green", "50", "F");
    tree pine = new tree ("Large", "green", "190", "F");
    tree bonsai = new tree ("small", "green", "5", "M");

    myTrees.add(mapple);
    myTrees.add(ebony);
    myTrees.add(oak);
    myTrees.add(pine);
    myTrees.add(bonsai);
  }

  public static void main(String[] args) {

  }
}
