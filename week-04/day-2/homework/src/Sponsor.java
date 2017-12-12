public class Sponsor {
    String name;
    int age;
    String gender;
    String company;
    int hiredStudents;

    public void introduce(){
        System.out.printf("Hi, I am " + name + ", a " + age + " year old " + gender + " who represents " + company +
                " and hired " + hiredStudents + " so far.");
    }

    public void getGoal () {
        System.out.printf("Hire brilliant junior software developers.");
    }

    public void hire(){
        hiredStudents += 1;
    }

    public Sponsor (String name, int age, String gender, int hiredStudents) {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.hiredStudents = 0;
        this.company = "Google";
    }
}
