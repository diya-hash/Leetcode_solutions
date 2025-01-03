package SlidingWindow.easy;

import java.util.Arrays;

public class longestharmoniousSubseq {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 1 };
        int left = 0;
        int right = 1;
        int max = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        while (right < nums.length) {
            if (nums[right] - nums[left] < 1) {
                right++;
            } else if (nums[right] - nums[left] == 1) {
                if (right - left + 1 > max)
                    max = right - left + 1;
                right++;
            } else {
                left++;
            }
        }
        System.out.println(max);
    }
}
