package Leetcode_solutions.Blind75.Matrix;

public class prodOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };
        int[] result = new int[nums.length];
        int prod = 1;
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                prefix = 1;
            else
                prefix *= nums[i - 1];
            suffix = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (i == nums.length - 1)
                    suffix = 1;
                else
                    suffix *= nums[j];
            }
            System.out.println("i: " + i + " prefix: " + prefix + " suffix: " + suffix);
            prod = prefix * suffix;
            result[i] = prod;

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
