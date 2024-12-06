package easy;

public class removeDupsFromSortedArr {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4 };
        int dup = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[dup] = nums[i];
                dup = dup + 1;
            }
        }
        for (int i = 0; i < dup; i++) {
            System.out.println(nums[i]);
        }
    }
}
// problem link:
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/