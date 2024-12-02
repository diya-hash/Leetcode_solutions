package Leetcode_solutions.TwoPointers;

public class sortArrayByParity {
    public static void main(String[] args) {
        int[] nums = { 0 };
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            System.out.println("odd: " + nums[left]);
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }
            System.out.println("even: " + nums[right]);
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
// solution post:
// https://leetcode.com/problems/sort-array-by-parity/solutions/6102424/java-easy-two-pointer-solution-beats-100/