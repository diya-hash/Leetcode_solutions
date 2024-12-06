package easy;

import java.util.Arrays;

public class minAvgSmallestLargestElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 7, 8, 9 };
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double min = 100000;

        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            if (avg < min) {
                min = avg;
            }
            left++;
            right--;
        }
        System.out.println(min);
    }
}
// problem link:
// https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/