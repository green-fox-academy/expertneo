public class string03 {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        System.out.println(quote.indexOf("you expect"));

        String var = "";
        var = new StringBuilder(quote).insert((quote.indexOf("you expect") - 1), " always takes longer than").toString();



        System.out.println(var);
    }
}
