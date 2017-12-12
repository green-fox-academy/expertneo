import java.util.ArrayList;
import java.util.List;

public class PallidaClass {
  private String className;
  private List<Student> students;
  private List<Mentor> mentors;

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor (Mentor mentor) {
    mentors.add(mentor);
  }

  public void info  () {
    System.out.println("Pallida " + className + " class has " + students.size() + " students and " +
    mentors.size() + " mentors.");
  }

  public PallidaClass (String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }
}
