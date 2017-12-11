/**
 * Created by aze on 2017.03.29..
 */
public class Thing {
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

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}