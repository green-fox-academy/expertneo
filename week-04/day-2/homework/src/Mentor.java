public class Mentor {
    String name;
    int age;
    String gender;
    String level;

    public void introduce(){
        System.out.printf("Hi, I am " + name + ", a " + age + " year old " + gender + level + " mentor.");
    }

    public void getGoal () {
        System.out.printf("Educate brilliant junior software developers.");
    }

    public Mentor () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }
}
