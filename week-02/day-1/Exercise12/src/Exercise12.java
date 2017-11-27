public class Exercise12 {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double a = 10.5;
        double b = 20.5;
        double c = 12.5;

        double volume = a * b * c;
        double area = 2 * (a * b + a * c + b * c);

        System.out.println("Surface Area: " + area);
        System.out.println("Volume:" + volume);
    }
}
