import java.util.*;

public class map01 {
    public static void main(String[] args) {
        String out = "";
        int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(7, "run around and desert you");
        map.put(50, "tell a lie and hurt you");
        map.put(49, "make you cry, ");
        map.put(2, "let you down");
        map.put(12, "give you up, ");
        map.put(1, "Never gonna ");
        map.put(11, "\n");
        map.put(3, "say goodbye");

        // Things are a little bit messed up
        // Your job is to decode the notSoCrypticMessage by using the hashmap as a look up table
        // Assemble the fragments into the out variable

        for (int i = 0; i < 15; i++) {
            if (notSoCrypticMessage[i] == 1) {
                out = out + map.get(1);
            } else if (notSoCrypticMessage[i] == 2) {
                out = out + map.get(2);
            } else if (notSoCrypticMessage[i] == 3) {
                out = out + map.get(3);
            } else if (notSoCrypticMessage[i] == 7) {
                out = out + map.get(7);
            } else if (notSoCrypticMessage[i] == 11) {
                out = out + map.get(11);
            } else if (notSoCrypticMessage[i] == 12) {
                out = out + map.get(12);
            } else if (notSoCrypticMessage[i] == 49) {
                out = out + map.get(49);
            } else if (notSoCrypticMessage[i] == 50) {
                out = out + map.get(50);
            }
        }
        System.out.println(out);
    }
}