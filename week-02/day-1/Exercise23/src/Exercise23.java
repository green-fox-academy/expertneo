public class Exercise23 {
    public static void main(String[] args) {
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"

        int a = 1;
        while (a <= 100) {
            System.out.println("I won't cheat on the exam!");
            a = a + 1;
        }



        // or i could solve this with



        for (int i = 0; i <= 100; i++)
            System.out.println("I won't cheat on the exam!");
    }
}
