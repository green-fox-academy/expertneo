import java.util.Arrays;

public class colors {
    public static void main(String[] args) {
        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

        String[][] array = new String[3][5];
        array[0] = new String[] {"lime", "forest green", "olive", "pale green", "spring green"};
        array[1] = new String[] {"orange red", "red", "tomato"};
        array[2] = new String[] {"orchid", "violet", "pink", "hot pink"};

        //QC here
        System.out.println(Arrays.toString(array[0]));
    }
}
