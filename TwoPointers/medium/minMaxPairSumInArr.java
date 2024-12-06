package medium;

import java.util.Arrays;

public class minMaxPairSumInArr {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 4, 2, 4, 6 };
        int i = 0;
        int j = nums.length - 1;
        int max = -10;
        Arrays.sort(nums);
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum >= max) {
                max = sum;
            }
            i++;
            j--;
        }
        System.out.println(max);
    }
}
