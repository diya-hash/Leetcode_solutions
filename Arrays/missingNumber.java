
//problem link: https://leetcode.com/problems/missing-number/submissions/1449894453/
package Leetcode_solutions.Arrays;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int[] occurs = new int[nums.length + 1];
        int result = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            occurs[nums[i]]++;
        }
        for (int i = 0; i <= nums.length; i++) {
            if (occurs[i] == 0)
                result = i;
        }
        System.out.println(result);
    }

}
