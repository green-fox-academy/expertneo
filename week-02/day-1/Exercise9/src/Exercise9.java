public class Exercise9 {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        // Print the Body mass index (BMI) based on these values

        double bmiIndex = (massInKg / heightInM) / heightInM;
        System.out.println("BMI index is: " + bmiIndex);
    }
}
