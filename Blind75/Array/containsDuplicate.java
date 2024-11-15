
package Leetcode_solutions.Blind75.Array;

import java.util.*;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, -2, -3, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean result = false;

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null)
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);

            if (map.get(nums[i]) > 1) {
                result = true;
            }
            System.out.println(map.get(nums[i]));
        }
        System.out.println(result);
    }

}
// problem link: https://leetcode.com/problems/contains-duplicate/description/