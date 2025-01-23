import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class thirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2147483647, -2147483648 };
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        if (set.size() >= 3) {
            set.remove(Collections.max(set));
            set.remove(Collections.max(set));
        }
        System.out.println(Collections.max(set));
    }
}
