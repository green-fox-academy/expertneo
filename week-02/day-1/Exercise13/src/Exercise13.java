public class Exercise13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int maxHours = 24;
        int maxMinutes = 60;
        int maxSeconds = 60;
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables

        int remainingHours = maxHours - currentHours;
        int remainingMinutes = maxMinutes - currentMinutes;
        int remainingSeconds = maxSeconds - currentSeconds;

        System.out.println("The remaining time from a day is: " + remainingHours + " Hours, "
        + remainingMinutes + " Minutes and " + remainingSeconds + " Seconds");
    }
}
