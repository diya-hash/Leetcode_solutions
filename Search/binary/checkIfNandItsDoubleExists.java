package Search.binary;

import java.util.Arrays;
import java.util.HashSet;

public class checkIfNandItsDoubleExists {
    public static void main(String[] args) {
        int[] arr = { -20, 8, -6, -14, 0, -19, 14, 4 };
        HashSet<Integer> set = new HashSet<>();
        boolean isTrue = false;
        for (int i : arr) {
            if (set.contains(i * 2) || (set.contains(i / 2) && i % 2 == 0)) {
                isTrue = true;
                break;
            }
            set.add(i);
        }
        System.out.println(isTrue);
    }
}