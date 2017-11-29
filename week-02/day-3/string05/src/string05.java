public class string05 {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        StringBuilder var = new StringBuilder(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");

        for (int i = 0; i<reversed.length(); i++) {
            var.setCharAt(i, reversed.charAt((reversed.length()-(i+1))));
        }

        System.out.println(reversed);
        System.out.println(var);
    }
}



//            (var.replace(var.charAt(i), reversed.charAt((reversed.length()-(i+1))))).charAt(i);
//            System.out.println(var.replace(var.charAt(i), reversed.charAt((reversed.length()-(i+1)))).charAt(i));