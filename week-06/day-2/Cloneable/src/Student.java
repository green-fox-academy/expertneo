public class Student extends Person implements Cloneable{
//  String name;
//  int age;
//  String gender;
  private String previousOrganization;
  private int skippedDays;

  public void introduce () {
    System.out.println("Hi, I am " + name + " , a " + age + " year old " + gender +
    " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal () {
    System.out.println("Be a junior software developer.");
  }

  public int skipDays (int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
    return  skippedDays;
  }

  public Student (String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
//    this.name = name;
//    this.age = age;
//    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student(){
    super("Jane Doe", 30,"female");
//    this.name = "Jane Doe";
//    this.age = 30;
//    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    // Exercise for 01.Jan,2018
    Student john = new Student("John Doe", 20, "male", "BME");
    Student johnTheClone = (Student) john.clone();

    System.out.println(johnTheClone.name);
  }
}
