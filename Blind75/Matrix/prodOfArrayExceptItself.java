package Leetcode_solutions.Blind75.Matrix;

public class prodOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] suff_arr = new int[nums.length];
        int[] result = new int[nums.length];
        int prod = 1;
        int prefix = 1;
        int suffix = 1;

        suffix = nums[nums.length - 1];
        nums[nums.length - 1] = 1;
        suff_arr[nums.length - 1] = 1;
        System.out.println(suff_arr[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            suff_arr[i] = suffix;
            System.out.println(suff_arr[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                prefix = 1;
            else
                prefix *= nums[i - 1];
            // removed suffix calculation
            // System.out.println("i: " + i + " prefix: " + prefix + " suffix: " +
            // suff_arr[i]);
            prod = prefix * suff_arr[i];
            result[i] = prod;

        }
        for (int i = 0; i < suff_arr.length; i++) {
            System.out.println(result[i]);
        }
    }
}
