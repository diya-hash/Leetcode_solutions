package Search.binary;

import java.util.Arrays;

public class findTargetIndicesAfterSortArr {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 2;

        Arrays.sort(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
