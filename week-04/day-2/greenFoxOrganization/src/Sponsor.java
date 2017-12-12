public class Sponsor extends Person {
//  String name;
//  int age;
//  String gender;
  private String company;
  private int hiredStudents;

  public void introduce () {
    System.out.println("Hi, I am " + name + " , a " + age + " year old " + gender + " who represents " +
    company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal () {
    System.out.println("Hire brilliant junior software developers.");
  }

  public int hire (){
    hiredStudents += 1;
    return hiredStudents;
  }

  public Sponsor (String name, int age, String gender, String company) {
    super(name, age, gender);
//    this.name = name;
//    this.age = age;
//    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor(){
    super("Jane Doe", 30,"female");
//    this.name = "Jane Doe";
//    this.age = 30;
//    this.gender = "female";
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
