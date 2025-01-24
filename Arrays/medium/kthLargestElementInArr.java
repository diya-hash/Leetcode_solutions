package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class kthLargestElementInArr {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 }; // 1 2 2 3 3 4 5 5 6
        int k = 4;
        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }
}
