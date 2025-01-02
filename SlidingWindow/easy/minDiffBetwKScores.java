package SlidingWindow.easy;

import java.util.Arrays;
import java.util.HashMap;

public class minDiffBetwKScores {
    public static void main(String[] args) {
        int[] nums = { 9, 4, 1, 7 };
        int k = 2;
        if (nums.length == 1) {
            System.out.println(0);
        } else {
            Arrays.sort(nums);
            int left = nums.length - k;
            int right = nums.length - 1;
            int min = 100001;
            while (left >= 0) {
                if (nums[right] - nums[left] < min)
                    min = nums[right] - nums[left];
                right--;
                left--;
            }
            System.out.println(min);
        }

    }
}