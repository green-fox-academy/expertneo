import java.util.*;

public class list03 {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.

        for (int i=0; i<far.size(); i++){
            String var = far.get(i);
            var = var + "a";
            far.set(i, var);
        }

        System.out.println(far);
    }
}
