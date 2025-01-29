import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        HashSet<Integer> set = new HashSet<>();
        int missingNum = 0;
        for (int i : nums) {
            set.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                missingNum = i + 1;
            }
        }
        System.out.println(missingNum);
    }

}
