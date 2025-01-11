package Recursion;

import java.util.HashMap;

public class climbingStaircase {
    private static HashMap<Integer, Integer> map = new HashMap<>();

    public static int climbStairs(int n) {
        map.put(1, 1);
        map.put(2, 2);

        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = climbStairs(n - 2) + climbStairs(n - 1);
        map.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
