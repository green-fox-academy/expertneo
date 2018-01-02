public class Thing implements Printable{
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  public boolean getCompleted() {
    return completed;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public void printAllFields() {
    System.out.println(toString());
  }
}
