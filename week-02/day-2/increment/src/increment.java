public class increment {
    public static void main(String[] args) {
//        -Create an array variable named `t`
//        with the following content: `[1, 2, 3, 4, 5]`
//        -Increment the third element
//        - Print the third element

        int[] t = new int[] {1, 2, 3, 4, 5};
        t[4]= t[4]++;
        System.out.println(t[4]);
    }
}
