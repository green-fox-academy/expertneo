public class Exercise8 {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int variable = a;

        a = b;
        b = variable;

        System.out.println(a);
        System.out.println(b);
    }
}
