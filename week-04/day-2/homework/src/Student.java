public class Student {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public void introduce(){
        System.out.printf("Hi, I am " + name + ", a " + age + " year old " + gender + " from" + previousOrganization +
                " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal () {
        System.out.printf("Be a junior software developer.");
    }

    public Student () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public void skipDays (int input) {
        skippedDays += input;
    }
}
