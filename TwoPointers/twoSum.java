package Leetcode_solutions.TwoPointers;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = new int[2];
        int[] copy = Arrays.copyOf(nums, nums.length);
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(copy);
        while (left < right) {
            if (copy[left] + copy[right] == target) {
                result[0] = copy[left];
                result[1] = copy[right];
                System.out.println(result[0] + " " + result[1]);
                break;
            } else if (copy[left] + copy[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (result[0] == nums[i]) {
                result[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (result[1] == nums[i]) {
                result[1] = i;
                break;
            }

        }
        System.out.println(" output1: " + result[0] + " output2: " + result[1]);

    }
}
