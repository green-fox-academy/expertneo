public class Exercise6 {
    public static void main(String[] args) {
        int averageHours = 6;
        int semesterLengthInWeeks = 17;
        int semesterLengthInDays = 17*7;
        int semesterLengthInHours = 17*7*24;
        int totalHours = (averageHours * (semesterLengthInDays - semesterLengthInWeeks * 2));
        double percentage = ((100 / (52 * 1.0)) * averageHours);

        System.out.println( totalHours + " hours are spent on coding by a student.");
        System.out.println(percentage + " % of the semester is spent on coding.. RIP");
    }
}
