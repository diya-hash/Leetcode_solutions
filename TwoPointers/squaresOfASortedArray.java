package Leetcode_solutions.TwoPointers;

public class squaresOfASortedArray {

    public static void main(String[] args) {
        int[] nums = { -5, -3, -2, -1 };
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
            System.out.println(nums[i]);
        }

        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left != right) {
            System.out.println("entered the while loop");
            if (nums[left] > nums[right]) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                if (nums[right] > nums[right - 1])
                    right--;
                if (nums[left] < nums[left + 1])
                    left++;

            } else if (nums[left] < nums[right]) {
                right--;
            }
            count++;
            for (int j = 0; j < nums.length; j++)
                System.out.print(nums[j] + "\t");
            System.out.println("");
            System.out.println("i: " + count + " left: " + left + " right: " + right);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
// problem link:unsolved
// https://leetcode.com/problems/squares-of-a-sorted-array/description/