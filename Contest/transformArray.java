package Leetcode_solutions.Contest;

public class transformArray {
    public static void main(String[] args) {
        int[] nums = { -1, 4, -1 };
        int[] result = new int[nums.length];
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] + i < nums.length) {
                r = nums[i] + i;
                result[i] = nums[r];
            } else if (nums[i] < 0) {
                r = nums[i] + i;
                r = nums.length - Math.abs(r);
                result[i] = nums[r];
            } else if (i + nums[i] >= nums.length) {
                r = (nums[i] + i) % nums.length;
                result[i] = nums[r];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }

    }
}
