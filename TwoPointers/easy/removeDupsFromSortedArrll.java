package Leetcode_solutions.TwoPointers;

public class removeDupsFromSortedArrll {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };

        int dup = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i - 2]) {
                nums[dup] = nums[i];
                dup = dup + 2;
            }
        }

        for (int i = 0; i < dup; i++)
            System.out.println(nums[i]);
    }
}
