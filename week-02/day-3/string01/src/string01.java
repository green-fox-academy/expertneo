public class string01 {
    public static void main(String[] args) {
        String example = "In a dishwasher far far away";

        example.replace("dishwasher", "galaxy");

        // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
        // Please fix it for me!
        // Expected ouput: In a galaxy far far away

        System.out.println(example);    //original
        System.out.println(example.replace("dishwasher", "galaxy"));    //solution
    }
}
