public class Mentor extends Person {
//  String name;
//  int age;
//  String gender;
  private String level;

  public void introduce () {
    System.out.println("Hi, I am " + name + " , a " + age + " year old " + gender + " " +
            level + " mentor.");
  }

  public void getGoal () {
    System.out.println("Educate brilliant junior software developers.");
  }

  public Mentor (String name, int age, String gender, String level) {
    super(name, age, gender);
//    this.name = name;
//    this.age = age;
//    this.gender = gender;
    this.level = level;
  }

  public Mentor(){
    super("Jane Doe", 30,"female");
//    this.name = "Jane Doe";
//    this.age = 30;
//    this.gender = "female";
    this.level = "Intermediate";
  }
}
