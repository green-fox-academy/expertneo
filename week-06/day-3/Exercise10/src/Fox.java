public class Fox {
  String color;
  String type;
  String name;

  public Fox(String color, String type, String name) {
    this.color = color;
    this.type = type;
    this.name = name;
  }

  public Fox() {
  }

  public String getColor() {
    return color;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public String getFox() {
    return getName() + " fox with " + getColor() + " color has a type of " + getType();
  }
}
