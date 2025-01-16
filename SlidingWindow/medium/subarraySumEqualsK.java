package SlidingWindow.medium;

import java.util.HashMap;

public class subarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                result += map.get(sum - k);
                
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        System.out.println(result);
    }
}
