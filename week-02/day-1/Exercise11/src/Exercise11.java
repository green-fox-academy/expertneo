public class Exercise11 {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        System.out.println(a + 10);


        int b = 100;
        // make it smaller by 7
        System.out.println(b - 7);


        int c = 44;
        // please double c's value
        System.out.println(c*2);


        int d = 125;
        // please divide by 5 d's value
        System.out.println(d / 5);


        int e = 8;
        e *= 2;
        // please cube of e's value
        System.out.println(e);


        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean asd = (f1 > f2);
        System.out.println(asd);


        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean asd2 = (g2*2) > g1;
        System.out.println(asd2);


        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean canBeDivided = h % 11 == 0;
        System.out.println(canBeDivided);


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean lol = i1 > (i2*i2) && i1 < (i2*i2*i2);
        System.out.println(lol);


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean lol2 = (j % 3 == 0) || (j % 5 == 0);
        System.out.println(lol2);


        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        k = "Apple Apple Apple Apple";
        System.out.println(k);
    }
}
