public class Person {
    String name;
    int age;
    String gender;

    public void introduce(){
        System.out.printf("Hi, I am " + name + ", a " + age + " year old " + gender);
    }

    public void getGoal () {
        System.out.printf("My goal is: Live for the moment!");
    }

    public Person () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }
}
