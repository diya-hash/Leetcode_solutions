package Leetcode_solutions.TwoPointers;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[r] == val)
                r--;
            else if (nums[l] != val)
                l++;
            else if (nums[l] == val) {
                nums[l] = nums[r];
                nums[r] = val;
                r--;
                l++;
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.println(nums[i]);
        }
    }
}
// problem link: https://leetcode.com/problems/remove-element/description/
// solution post on leetcode:
// https://leetcode.com/problems/remove-element/solutions/6070602/java-solution-beats-100/